fun main(array: Array<String>) {
    println("Введите число N:")
    var N: Int = readln().toInt();
    var num_0: Int = 0;
    var num_1: Int = 1;
    var i: Int = 0;

    print("$num_0 $num_1 ")

    while (i != N) {
        val num_2 = num_1 + num_0
        num_0 = num_1
        num_1 = num_2

        print("$num_1 ")
        i++
    }

}
