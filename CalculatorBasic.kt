fun main() {
    while (true) {
        print("Enter the first number: ")
        val num1 = takeUserInput()
        println(num1)

        print("Enter the second number: ")
        val num2 = takeUserInput()
        println(num2)

        val sum = num1 + num2
        println("$num1 + $num2 = $sum")

        print("Would you like another calculation? y/n")
        val answer = readLine()!!
        if (answer.startsWith('n')){
            println("Closing Calculator")
            break
        }

    }
}

fun takeUserInput(): Int {
    var number: Int
    try {
        number = readLine()!!.toInt()
        println("good, a number!")
    } catch (e: Exception) {
        println("zero!! zero!!")
        number = 0
    }
    return number
}