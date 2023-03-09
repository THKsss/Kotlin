fun main(array: Array<String>) {
    println("Введите число для которой нужно найти комбинации:");
    var S: Int = readln().toInt();

    println("Введите число для ограничение поиска");
    var N: Int = readln().toInt();

    for (a in 0.. N) {
        for (b in 0.. N) {
            for (c in 0.. N) {
                if (a + b + c == S) {
                    println("$a $b $c")
                }
            }
        }
    }



}
