import java.util.Scanner





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
        enteredUser.verify(defaultUser)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}
