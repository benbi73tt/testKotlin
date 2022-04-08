package topics

fun main(){
    testWhen(1)
    testWhen("hello")
    testWhen(15)
}

//testWhen(Object)
fun testWhen(input:Any){ //любой тип данных
    when(input){
        1->println("Единица")
        2->println("Двойка")
        in 10..20 -> println("от 10 до 20")
        is String -> println("Была введена строка ${input.length}")
        else -> println("Что то еще")
    }





}