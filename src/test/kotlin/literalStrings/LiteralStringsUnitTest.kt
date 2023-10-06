import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertEquals
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

class LiteralStringUnitTest {
    @Test
    fun shouldPrintAUnicodeCharacter() {
        val mockOut = ByteArrayOutputStream()
        System.setOut(PrintStream(mockOut))
        val characterInUnicode = '\u20DF'
        val expectedResult ='⃟'

        println(characterInUnicode)
        val printedOutput = mockOut.toString().trim()

        assertEquals(printedOutput, expectedResult.toString())
    }

    @Test
    fun shouldPrintAStringWithScape() {
        val mockOut = ByteArrayOutputStream()
        System.setOut(PrintStream(mockOut))
        val name = "Pedro\nCapriles"
        val expectedValue = "$name\n"

        println(name)
        val printedOutput = mockOut.toString()

        assertEquals(printedOutput, expectedValue)
    }

    @Test
    fun shouldPrintAStringWithTab() {
        val mockOut = ByteArrayOutputStream()
        System.setOut(PrintStream(mockOut))
        val name = "Pedro\n\tCapriles"
        val expectedValue = "$name\n"

        println(name)
        val printedOutput = mockOut.toString()

        assertEquals(printedOutput, expectedValue)
    }

    @Test
    fun shouldPrintAStringWithABack() {
        val mockOut = ByteArrayOutputStream()
        System.setOut(PrintStream(mockOut))
        val name = "Pedro\n\t\bCapriles"
        val expectedValue = "$name\n"

        println(name)
        val printedOutput = mockOut.toString()

        assertEquals(printedOutput, expectedValue)
    }

    @Test
    fun shouldPrintWithRawString() {
        val mockOut = ByteArrayOutputStream()
        System.setOut(PrintStream(mockOut))
        val paragraph = """Bacon ipsum dolor amet ground round shoulder corned beef ham hock shankle shank. Ham chislic hamburger picanha, cupim turkey pastrami tail frankfurter beef leberkas short ribs ribeye."""

        println(paragraph)
        val printedOutput = mockOut.toString().trim()

        assertEquals(printedOutput, paragraph)
    }

    @Test
    fun shouldPrintStringTemplate() {
        val mockOut = ByteArrayOutputStream()
        System.setOut(PrintStream(mockOut))
        val myName = "Pedro Capriles"
        val myCountry = "Venezuela 🇻🇪"
        val expectedValue = "My name is: Pedro Capriles my country is Venezuela 🇻🇪"
        val expectedValueInSecond = "The last character have 55 characters"

        println("My name is: $myName my country is $myCountry")
        val printedOutput = mockOut.toString().trim()

        assertEquals(printedOutput, expectedValue)
        assertEquals("The last character have ${expectedValue.length} characters", expectedValueInSecond)
    }
}