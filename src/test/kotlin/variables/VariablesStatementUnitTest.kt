import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import variables.VariablesStatement.greetings

class VariablesStatementUnitTest {
    @Test
    fun ShouldPrintByScreenSomeGreetings() {
        val mockOut = ByteArrayOutputStream()
        System.setOut(PrintStream(mockOut))
        val expectedValue = "Hello cruel world!\nHello cruel world!\nHello cruel world!\nGood bye\nGood bye\nGood bye\nMay 23th, 1989\nThis is my string Hello cruel world!"

        greetings()
        val printedOutput = mockOut.toString().trim()

        assertEquals(expectedValue, printedOutput)
    }
}