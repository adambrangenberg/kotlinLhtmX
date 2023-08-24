val githubRepo = "adambrangenberg/kotlinLhtmX"

plugins {
    kotlin("multiplatform") version "1.8.20"
    id("maven-publish")
    id("signing")
}

group = "de.adamwv.kotlinLhtmX"
version = "1.0-SNAPSHOT"

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

publishing {
    publications {
        repositories {
            if (publishingUser == null || publishingUrl == null || publishingPassword == null) return@repositories

            maven {
                url = uri(publishingUrl)
                credentials {
                    username = publishingUser
                    password = publishingPassword
                }
            }

            publications {
                create<MavenPublication>(project.name) {
                    this.groupId = groupId
                    this.artifactId = project.name
                    this.version = version

                    pom {
                        description.set(project.description)
                        url.set("https://github.com/$githubRepo")

                        developers {
                            developer {
                                name.set("Adam Brangenberg")
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
    }
}