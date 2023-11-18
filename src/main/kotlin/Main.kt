import java.util.Scanner

data class User(
    val username: String,
    val email: String,
    val age: Int,
    val password: String
)

interface Verifiable {
    fun verify(user: User)
}

fun User.verify(otherUser: User) {
    // Шаг 3: Провести проверку
    if (this == otherUser) {
        println("Вход выполнен успешно!")
    } else {
        throw IllegalArgumentException("Неверные данные для входа")
    }
}

fun main() {
    val defaultUser = User("the_user", "the_gmail", 10, "the_password")

    val scanner = Scanner(System.`in`)
    print("Введите ваш username: ")
    val enteredUsername = scanner.nextLine()
    print("Введите ваш email: ")
    val enteredEmail = scanner.nextLine()
    print("Введите ваш возраст: ")
    val enteredAge = scanner.nextInt()
    print("Введите ваш password: ")
    val enteredPassword = scanner.next()
    val enteredUser = User(enteredUsername, enteredEmail, enteredAge, enteredPassword)

    try {
        // Шаг 7: Вызвать функцию verify
        enteredUser.verify(defaultUser)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}
