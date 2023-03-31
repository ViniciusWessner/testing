fun main() {
    print("Digite um número: ")
    val num = readLine()!!.toInt()
    val fibonacci = mutableListOf(0, 1)

    while (fibonacci.last() < num) {
        val nextFibonacci = fibonacci.last() + fibonacci[fibonacci.size - 2]
        fibonacci.add(nextFibonacci)
    }

    if (num in fibonacci) {
        println("O número $num pertence à sequência de Fibonacci.")
    } else {
        println("O número $num não pertence à sequência de Fibonacci.")
    }
}