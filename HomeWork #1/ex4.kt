fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11, 12, 13, 14)

    print("Введите сумму заказа: ")
    val num = (readLine().toString().toInt()).toString();
    if(num.toInt() % 10 in numbers.slice(4..9) || num.toInt() % 100 in numbers.slice(10..13)){
        print("Сумма заказа: $num рублей");
    }

    else if(num.toInt() % 10 == 1){
        print("Сумма заказа: $num рубль");
    }

    else if(num.toInt() % 10 == 2 || num.toInt() % 10 == 3 || num.toInt() % 10 == 4){
        print("Сумма заказа: $num рубля");
    }
}