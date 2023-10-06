package variables.VariablesStatement

fun greetings() {
    var welcome = "Hello cruel world!"
    val birthday = "May 23th, 1989"

    println(welcome)
    println(welcome)
    println(welcome)
    welcome = "Good bye"
    println(welcome)
    println(welcome)
    println(welcome)
    println(birthday)
    welcome = "Hello cruel world!"
    println("This is my string $welcome")
}