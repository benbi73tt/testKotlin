package topics

fun main(){
    var a: String ="Hello"
//    a=null Полностью исключены NullPointerException

    var b:String?="Test" //Заставляет использовать null
    b= null

    b?.length //Savecall безопасный вызыв, если null то вернётся Null(нет NPE)


    //Elvis оператор - ?:
    val l = b?.length ?: -1

    b= if((0..10).random()>5) "asdf" else null

    //!! -выбрасывает NPE если Null
    val t = b!!.length
}