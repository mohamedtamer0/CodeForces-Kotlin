@OptIn(kotlin.ExperimentalStdlibApi::class)
fun main() {
    var first = readLine()!!.toString()
    var second = readLine()!!.toString()
    first = first.lowercase()
    second = second.lowercase()
    var n = first.compareTo(second)
    if (n == 0)
        println("0")
    else if (n > 0)
        println("1")
    else
        println("-1")
}