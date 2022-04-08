package topics

fun main(){
    val a =listOf(1,2,3,4,5)

    a.forEach{e-> println(e)}
    println(a.map { e->e*2 })

    println(a.filter { e->e%2==0 })

    println(a.reduce{sum,e->sum+e}) //sum()

    a.sortedByDescending { it } //сортировка по полю

    a.any{it>10} //true если удовлетворяет условию хотя бы 1 элемент

    a.all { it<10 } //если все удовл. условию

    a.sum();


    val numbers = listOf(1,4,-5,1,-11)
    val (positive, negative) = numbers.partition { it>0 } // разделение на 2 переменные
    println(positive)
    println(negative)

    val result = listOf("a","b","ba","sa","ad","ccc").groupBy { it.length } //сгруппировать по длине

    println(result) //hashMap или LinkedHashMap






















}