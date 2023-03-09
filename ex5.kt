import kotlin.random.Random

fun main(args: Array<String>) {

    var text_output = "Здравствуйте, ";
    val celebr_text = listOf(" кайфа побольше!", ", чтобы код писался спокойно!", " жизни веселой", " счастья!", " здоровья!", " жизни сладкой!");

    print("Введите Ваш возраст: ")
    val age = readLine().toString().toInt();

    print("Введите Вашу Фамилию: ")
    val last_name = readLine().toString();
    print("Введите Ваше Имя: ")
    val first_name = readLine().toString();
    print("Введите Ваше Отчество: ")
    val middle_name = readLine().toString();

    print("Введите Ваш пол: ")
    val gender = readLine().toString();

    if (age in 18..99){
        if (gender.lowercase() == "женщина"){
            text_output += "Уважаемая, $first_name $middle_name. ";
        } else if (gender.lowercase() == "мужчина"){
            text_output += "Уважаемый, $first_name $middle_name. ";
        }

        if(age % 5 == 0) {
            val wish = Random.nextInt(celebr_text.size)
            val wish_text = celebr_text[wish];
            text_output += "Поздравляю с юбилеем, желаю Вам$wish_text";

        } else{
            val wish = Random.nextInt(celebr_text.size)
            val wish_text = celebr_text[wish];
            text_output += "Поздравляю с ДР, желаю Вам$wish_text";
        }
    } else {
        print("Недопустимый возраст")
    }

    print(text_output);
}