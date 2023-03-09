fun main(array: Array<String>) {
    println("Введите число A:")
    var A: Int = readln().toInt();

    println("Введите число B:")
    var B: Int = readln().toInt();

   if (A > B) {
       for (n in B..A) {
           println("Число $n в кубе: ${n*n*n}")
       }
   }
    else {
       for (n in A..B) {
           println("Число $n в кубе: ${n*n*n}")
       }
   }

}
