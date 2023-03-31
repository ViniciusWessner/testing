fun main() {
    val str = "exemplo de string"
    var reversedStr = ""
    for (i in str.length - 1 downTo 0) {
        reversedStr += str[i]
    }
    println("String original: $str")
    println("String invertida: $reversedStr")
}