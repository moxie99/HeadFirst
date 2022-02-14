import java.util.*

fun main(args: Array<String>) {

//    var letter: String = "fdgjjhkfdrdvbjkhjfhgvjvgfcb"
//    var check: String ="ftkjyfvnj"
//
//    var yesOrNo = letter.compareTo(check)
//    println(yesOrNo)
//
//    println(letter.plus(check))

    /*
    Kade is a male student of Coronal Schools. He offers ten(10)
    subjects. He's daily allowance is 500 naira. His Math grade is A.

     */

    var name: String = "Kade"
    var isMale: Boolean = true
    var school: String = "Coronal Schools"
    var numberOfSubjectsOffered: Int = 10
    var allowance: Int = 500
    var mathGrade: Char = 'A'

    var reader = Scanner(System.`in`)
    println("Please, enter your name")
    var nameStudent: String= reader.next()

    when(nameStudent){
        "Kade" -> println("This is your name: $nameStudent")
        "Romzy" -> println("This is your name: $nameStudent")
    }

    var letters = 'a'..'x'
    for(letter in letters){
        println(letter)
    }



    println("Please, enter the starting Number")
    var startNumber: Int = reader.nextInt()

    println("Please, enter the ending number")
    var endNumber: Int= reader.nextInt()

    var primeNumbersBetween1And100 = startNumber..endNumber
    for (number in primeNumbersBetween1And100){
        if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0 || number % 7 == 0){
            continue
        }else{
            println(number)
        }
    }




}