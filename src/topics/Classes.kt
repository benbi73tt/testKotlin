package topics

fun main() {
    val child = Person("child", "Tom", 2)
    val pl = Person("Tom", "Smit", 25, child)
    print(pl.firstName)

    val rectangle1 = Rectangle(5.0,2.0)
    println("The  perimeter is ${rectangle1.perimeter}")

    val rectangle2 = Rectangle(5.0,2.0)

    println(rectangle1==rectangle2)

}

//Primary Constructor - первичный конструктор
class Person(val firstName: String, val lastName: String, var age: Int) {
    var children: MutableList<Person> = mutableListOf()//ArrayList

    init { //Конструктор для присвоения значений
        println("Person is created $firstName")
    }

    //вторичный конструктор
    constructor(firstName: String, lastName: String, age: Int, child: Person) : this(firstName, lastName, age) {
        children.add(child)
    }

    //конструктор без аргументов
    constructor() : this("", "", -1)
}

data class Rectangle(var height: Double, var length: Double) { //data - автосоздание set get equals hashcode
    var perimeter = (height + length) * 2

    var test = 1
        get() = field + 1 //field = this В java
        set(value) {
            if (value < 0) println("Negative value")
            field = value
        }

    fun area() = height * length //упрощенный синтаксис для функции
}