package mate.academy

fun greetUsers() {
    fun askName() : String {
        println("Please enter a name (or press Enter to quit):")
        return readln()
    }

    fun printGreeting(name: String) {
        println("Hello, $name!")
    }

    while (true) {
        val name = askName()
        when {
            name.isBlank() -> return
            else -> printGreeting(name)
        }
    }
}

fun main() {
    greetUsers()
}
