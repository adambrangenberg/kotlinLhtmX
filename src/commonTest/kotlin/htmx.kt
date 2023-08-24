import de.adamwv.kotlinLhtmX.hxGet
import de.adamwv.kotlinLhtmX.includeHtmx
import kotlinx.html.div
import kotlinx.html.head
import kotlinx.html.stream.createHTML
import kotlin.test.Test
import kotlin.test.assertEquals

class HtmxTests {
    private val htmxVersion = "1.9.4"

    @Test
    fun hxGetTest() {
        val gen = createHTML(false).div {
            hxGet("/joseph")
        }

        assertEquals(gen, "<div hx-get=\"/joseph\"></div>")
    }

    @Test
    fun includeHtmxTest() {
        val gen = createHTML(false).head {
            includeHtmx()
        }

        assertEquals(gen, "<head><script src=\"https://unpkg.com/htmx.org@$htmxVersion\"></script></head>")
    }
}