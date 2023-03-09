fun main(array: Array<String>) {
    println("Введите число:");
    var num: Int = readln().toInt();

    while (num != 1) {
        if (num % 2 == 0) {
            num /= 2
        }
        else {
            num = (((num * 3) + 1) / 2)
        }
        println(num);
    }

}
