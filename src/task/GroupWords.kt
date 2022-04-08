package task

fun main(){
    //в списке слов, рабить слова на группы, буквы в слове у которых одинаковые (eat,ate,tea)

    println(groupWord(arrayOf("eat","tea","tan","ate","nat","bat")))
}

fun groupWord(words: Array<String>): List<List<String>>{

    var result: MutableList<List<String>> = mutableListOf()

    var map = mutableMapOf<String, MutableList<String>>()


    for(word in words){
        var sortedWord = word.toCharArray().sorted().joinToString("")
        if (map.containsKey(sortedWord)){
            map[sortedWord]?.add(word)
        }
        else{
            map[sortedWord] = mutableListOf(word)
        }
    }
    for((key,value) in map){
        result.add(value)
    }
    return result
}
