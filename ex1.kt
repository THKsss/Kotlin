fun main(args: Array<String>) {

    print("Введите Ваш двузначный пароль: ")
    val num = (readLine().toString().toInt()).toString();

    if(num.length > 2){
        println("Пароль слишком длинный")
    } else if("7" in num){
        print("Семерка есть, проходи");
    } else {
        print("Семерки нет, уходим")
    }

}