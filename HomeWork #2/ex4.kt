fun main(array: Array<String>) {
    println("Введите число:");
    var num: String = readln().toString();
    println("Введите число, которое хотите удалить:");
    var num_delete: String = readln().toString();
    var result = "";

    for (n in num) {
        if (n.toString() != num_delete) {
            result += n.toString()
        }
    }

    println("Итог: $result")


}
