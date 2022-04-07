package topics

import java.util.*

fun main() {
    println(testSimple(3, 10))
    println(testString(15))
    println(testNamedArguments(10, 12, 25))

    testNamedArguments(y = 4, z = 5, x = 1)

    testDefaultArguments()
    testDefaultArguments(x=15)
    testDefaultArguments(y=5,x=7)

    printEven(1,2,4,7,4,23,5,4,253,64,2,2,6,45,34)
    println("printEven")
    printEven(*intArrayOf(1,2,3,5,6),6,3,1,3,5,2,12,6,10)
}

fun testSimple(x: Int, y: Int): Int = x + y //fun название(аргумент): Возвращаемое значение

fun testString(x: Int): String {
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}


//void
fun testDefaultArguments(x: Int = 1, y: Int = 2) {//значение по умолчанию
    println(x + y)
}

fun foo(name:String, number: Int = 42, toUpperCase: Boolean=false){ // в Котлин не нужны перегрузка, т.к если аргументы по умолчанию
    (if (toUpperCase) name.uppercase(Locale.getDefault()) else name)+number
}
 //vararg
fun printEven(vararg numbers: Int){ //можем передать сколько угодно элементов через запятую благодаря vararg
    numbers.forEach { e->if (e%2==0) println(e) }
}

