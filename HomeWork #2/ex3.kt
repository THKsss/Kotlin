fun main(array: Array<String>) {
    println("Введите число:")
    var N: Int = readln().toInt();
    var reversed = 0

    while (N != 0) {
        val step = N % 10
        reversed = reversed * 10 + step
        N /= 10
    }

    println("Reversed Number: $reversed")

}
