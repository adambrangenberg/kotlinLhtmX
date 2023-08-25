val githubRepo = "adambrangenberg/kotlinLhtmX"
val projectName = "kotlinLhtmX"
plugins {
    kotlin("multiplatform") version "1.8.20"
    id("maven-publish")
    id("signing")
    id("io.github.gradle-nexus.publish-plugin") version "1.3.0"
}
group = "de.adamwv"
version = "1.0.0"

repositories {
    mavenCentral()
}

val emptyJar = tasks.register<org.gradle.jvm.tasks.Jar>("emptyJar") {
    archiveAppendix.set("empty")
}

kotlin {
    jvm {
        mavenPublication {
            groupId = group as String
            pom {
                name.set("${project.name}-jvm")
            }

            artifact(emptyJar) {
                classifier = "javadoc"
            }
        }
    }
    js(IR) {
        moduleName = project.name
        browser()

        mavenPublication {
            groupId = group as String
            pom {
                name.set("${project.name}-js")
            }
        }
    }

    mingwX64()
    linuxX64()
    linuxArm64()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-html:0.9.1")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

val publishingUser: String? = System.getenv("PUBLISHING_USER")
val publishingPassword: String? = System.getenv("PUBLISHING_PASSWORD")
val publishingUrl: String? = System.getenv("PUBLISHING_URL")

nexusPublishing {
    repositories {
        sonatype {
            if (publishingUser == null || publishingUrl == null) {
                //return@sonatype
            }
            nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
            snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))
            username.set(publishingUser)
            password.set(publishingUrl)
        }
    }
}

publishing {
    publications {

        create<MavenPublication>(project.name) {
            this.groupId = groupId
            this.artifactId = project.name
            this.version = version

            pom {
                name.set(projectName)
                description.set(project.description)
                url.set("https://github.com/$githubRepo")

                developers {
                    developer {
                        name.set("Adam Brangenberg")
                        email.set("adambrangenberg@proton.me")
                    }
                }

                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://opensource.org/licenses/MIT")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/${githubRepo}.git")
                    url.set("https://github.com/${githubRepo}/tree/main")
                }
            }
        }
    }
}

