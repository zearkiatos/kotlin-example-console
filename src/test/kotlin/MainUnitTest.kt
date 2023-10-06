import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

class MainUnitTest {

    @Test
    fun testMainFunction() {
        val mockOut = ByteArrayOutputStream()
        System.setOut(PrintStream(mockOut))
        val args = arrayOf("")
        val firstCall = "Hello World!\n"
        val secondCall = "Program arguments:"
        val expectedValue = firstCall + secondCall
        
        main(args)
        val printedOutput = mockOut.toString().trim()

        assertEquals(expectedValue, printedOutput)
    }

    @Test
    fun testMainWhenSendAParamFunction() {
        val mockOut = ByteArrayOutputStream()
        System.setOut(PrintStream(mockOut))
        val args = arrayOf("My Data")
        val firstCall = "Hello World!\n"
        val secondCall = "Program arguments: My Data"
        val expectedValue = firstCall + secondCall
        
        main(args)
        val printedOutput = mockOut.toString().trim()

        assertEquals(expectedValue, printedOutput)
    }
}