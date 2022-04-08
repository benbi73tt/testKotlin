package task

fun main() {
    ///aaaaaaabbbcccxyzddddddeeeeffffaaaaaabbbbbbbbbbbbbbb-> a8b3c3xyzd6e4f4a6b15s
    println(countLetters("aaaaaaabbbcccxyzddddddeeeeffffaaaaaabbbbbbbbbbbbbbbs"))
}

fun countLetters(str: String): String {
    var currentLetters = str.toCharArray()
    var letter = currentLetters[0]
    var count = 1
    var result = ""

    for (el in currentLetters) {
        if (el == letter)
            count++
        else if (count == 1) {
            result += letter
            letter = el
        } else {
            result += letter + "$count"
            letter = el
            count = 1
        }
    }
    if (count == 1)
        result += letter
    else
        result += letter + "$count"

    return result
}