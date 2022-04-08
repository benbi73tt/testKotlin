package task

fun main() {
    //Даны два массива, найти совпадающие числа и вывести их(если в первом
// и во втором массиве число встречается несколько раз, вывести сколько раз оно совпало)
    println(repeated(intArrayOf(1,7,2,4,5,6,6,7,9), intArrayOf(2,3,4,2,6,5,7,5,2,1,7,6)))
}

fun repeated(a1: IntArray, a2: IntArray): List<Int> {
    var s1 = a1.toHashSet()
    var s2 = a2.toHashSet()

    val result = mutableListOf<Int>()

    for (el in s1) {
        if (s2.contains(el)) {
            val countRepeated = minOf(a1.count { it == el }, a2.count { it == el })
            repeat(countRepeated) { result.add(el) }
        }
    }
    return result;
}