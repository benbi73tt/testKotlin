package topics

fun main() {
    val items = listOf("apple", "banana", "orange") //List.of()
//  mutableListOf("apple","banana","orange") // Изменяемый список ArrayList
    for (item in items)
        println(item)

    //while
    var index = 0
    while (index < items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }

    //Диапазон

    println(5 in 3..10) // содержится ли 5 в промежутке

    for (i in 1..10)
        println(i)

    for (i in 1 until 10) // не включая 10
        println(i)

    for (i in 10 downTo 1)
        println(i)

    for (i in 0..100 step 10) // шаг 10
        println(i)

}