fun main(args: Array<String>) {
    var word: String? = null
    var isHasCar = true

    //word = "hello"

    if(word == null) {
        println("Переменная word равна значению NULL")
        if(isHasCar) {
            println("Что то сработало")
        }
    } else if(word == "hello") {
        println("Переменная: $word")
    } else {
        print("Переменная word не равна значению NULL")
    }

    val number = 50
    when (number) {
        null -> print("Переменная равна null")
        5 -> print("Переменная равна 5")
        else -> print("Переменнная не понятная")
    }

//    var res = 0
//    if(number > 30)
//        res = 1
//    else
//        res = 10

    var res = if(number > 30) 1 else 10

    val words = when(number){
        null -> "Ничего"
        else -> number
    }
}