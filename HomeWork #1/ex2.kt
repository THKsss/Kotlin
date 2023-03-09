fun main(args: Array<String>) {

    print("Введите Ваш трехзначный пароль: ")
    val num = (readLine().toString().toInt()).toString();
    if (num.toInt() > 0) {
        if (num.length == 3) {
            if ("4" in num && "6" in num) {
                print("В числе $num есть 4 и 6");
            } else if ("4" !in num) {
                print("В числе $num нет 4");
            } else if ("6" !in num) {
                print("В числе $num нет 6");
            } else {
                print("В числе $num нет 4 и 6")
            }
        } else if (num.length < 3) {
            println("Пароль слишком короткий, нужно 3");
        } else {
            println("Пароль слишком длинный, нужно 3");
        }
    } else {
        println("Пароль слишком отрицательный");
    }
}