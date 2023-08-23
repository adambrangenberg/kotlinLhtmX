import de.adamwv.kotlinLhtmX.hxGet
import de.adamwv.kotlinLhtmX.includeHtmx
import kotlinx.html.body
import kotlinx.html.div
import kotlinx.html.head
import kotlinx.html.html
import kotlinx.html.stream.createHTML
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertFails

class HtmxTests {
    /*@Test
    fun includeTest() {
        assertFails {
            createHTML().div {
                hxGet("/joseph")
            }
        }
    }*/

    @Test
    fun hxGetTest() {

        val gen = createHTML().html {
            head {
                includeHtmx()
            }
            body {
                div {
                    hxGet("/joseph")
                }
            }
        }

        assertContains(gen, "<div hx-get=\"/joseph\"></div>")
    }
}