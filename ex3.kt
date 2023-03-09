fun main(args: Array<String>) {

    print("Введите начало диапазона: ")
    val num_start = (readLine().toString().toInt()).toString();

    print("Введите конец диапазона: ")
    val num_end = (readLine().toString().toInt()).toString();

    print("Введите число: ")
    val num = (readLine().toString().toInt()).toString();

    if (num.toInt() !in num_start.toInt()..num_end.toInt()){
        print("В диапазоне [$num_start, $num_end] нет числа $num");
    } else {
        print("В диапазоне [$num_start, $num_end] есть число $num");
    }
}