import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertEquals
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

class CharactersAndStringUnitTest {
    @Test
    fun shouldBeACharAndPrintValue() {
        val mockOut = ByteArrayOutputStream()
        System.setOut(PrintStream(mockOut))
        val x:Char = 'a'

        println(x)
        val printedOutput = mockOut.toString().trim()

        assertTrue(x is Char)
        assertEquals(x, printedOutput[0])
    }

    @Test
    fun shouldBeAStringAndPrintValue() {
        val mockOut = ByteArrayOutputStream()
        System.setOut(PrintStream(mockOut))
        val x:String = "Hello World"

        println(x)
        val printedOutput = mockOut.toString().trim()

        assertTrue(x is String)
        assertEquals(x, printedOutput)
        assertEquals(x[2], 'l')
        assertEquals(x.length, 11)
    }

    @Test
    fun shouldBeACharAndConvertToInteger() {
        val x:Char = '1'
        val expectedValue = 49
        val expectedAfterTheConvertion = 1

        val result = x.toInt()

        assertTrue(x is Char)
        assertTrue(result is Int)
        assertEquals(result, expectedValue)
        assertEquals(expectedAfterTheConvertion, expectedValue - 48)
        assertEquals(expectedAfterTheConvertion, x.digitToInt())
    }

    @Test
    fun shouldManipulateACharacterInUnitcode() {
        val characterInUnicode = '\uFA10'
        val expectedResult ='塚'

        assertTrue(characterInUnicode is Char)
        assertEquals(expectedResult, characterInUnicode)
    }

    @Test
    fun shouldBeAUnicode() {
        val characterInUnicode = '\u20DF'
        val expectedResult ='⃟'

        assertTrue(characterInUnicode is Char)
        assertEquals(expectedResult, characterInUnicode)
    }
}