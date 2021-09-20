//repeat if user enters wrong

fun main() {
    calculator()
}

fun operatorInput(): Char {
    var operator: Char = '?'
    try {
        operator = readLine()!!.first()
        //println("good, an operator!")
    } catch (e: Exception) {
        //println("no operator :(")
    }
    return operator
}

fun numberInput(): Float {
    var number: Float
    try {
        number = readLine()!!.toFloat()
        //println("good, a number!")
    } catch (e: Exception) {
        //println("zero!! zero!!")
        number = 0f
    }
    return number
}

fun calculate(num1: Float, num2: Float, operator: Char): Float {
    var cal: Float = 0f
    when (operator) {
        '*' -> cal = num1 * num2
        '/' -> cal = num1 / num2
        '+' -> cal = num1 + num2
        '-' -> cal = num1 - num2
        //else -> println("else??")
    }
    return cal
}

fun isValidOperator(operator: Char): Boolean {
    return operator == '*'|| operator == '+' || operator == '-' || operator == '/'
}

fun isZeroDiv(num: Float, operator: Char):Boolean {
    return num == 0f && operator =='/'
}

fun calculator() {
    while(true) {
        print("Enter the first number: ")
        val num1 = numberInput()

        print("Enter an operator: ")
        val op = operatorInput()
        if (!isValidOperator(op)) {
            println("you entered an invalid operator, try again.")
            continue
        }

        print("Enter the second number: ")
        val num2 = numberInput()
        if(isZeroDiv(num2, op)){
            println("you can not divide by zero, try again.")
            continue
        }

        var cal = calculate(num1, num2, op)
        println("the answer is $cal")
        println("${num1.toInt()} $op ${num2.toInt()} = $cal")
        break
    }
}