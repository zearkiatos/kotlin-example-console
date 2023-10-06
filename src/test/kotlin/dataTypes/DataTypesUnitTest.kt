import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertTrue

class DataTypesUnitTest {
    @Test
    fun shouldBeAnInteger() {
        val x = 18

        assertTrue(x is Int)
    }

    @Test
    fun shouldBeADouble() {
        val x = 15.18

        assertTrue(x is Double)
    }

    @Test
    fun shouldBeAChar() {
        val x = 'a'

        assertTrue(x is Char)
    }

    @Test
    fun shouldBeAString() {
        val x = "Hello World!"

        assertTrue(x is String)
    }

    @Test
    fun shouldBeABoolean() {
        val x = true

        assertTrue(x is Boolean)
    }

    @Test
    fun shouldBeAIntegerDeclaredInAnExplicitWay() {
        val x:Int = 21

        assertTrue(x is Int)
    }
}