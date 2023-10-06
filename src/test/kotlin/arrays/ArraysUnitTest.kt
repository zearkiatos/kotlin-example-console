import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertEquals
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock


class ArraysUnitTest {
    @Test
    fun shouldCreateAnIntegerArray() {
        val mockOut = ByteArrayOutputStream()
        System.setOut(PrintStream(mockOut))
        val integerArray = arrayOf(1, 2, 3)
        val expectedValue = "1"

        println(integerArray[0])
        val printedOutput = mockOut.toString().trim()

        assertEquals(printedOutput, expectedValue)
    }

    @Test
    fun shouldCreateAStringArray() {
        val mockOut = ByteArrayOutputStream()
        System.setOut(PrintStream(mockOut))
        val stringArray:Array<String> = arrayOf("Hello", "World", "Cruel")
        val expectedValue = "Cruel"

        println(stringArray[2])
        val printedOutput = mockOut.toString().trim()

        assertEquals(printedOutput, expectedValue)
    }

    @Test
    fun shouldCreateABooleanArray() {
        val mockOut = ByteArrayOutputStream()
        System.setOut(PrintStream(mockOut))
        val booleanArray = arrayOf(true, false, true)
        val expectedValue = "false"

        println(booleanArray[1])
        val printedOutput = mockOut.toString().trim()

        assertEquals(printedOutput, expectedValue)
    }
}