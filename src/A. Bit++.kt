fun main() {
    val n = readLine()!!.toInt()
    var x = 0
    for (i in 0 until n) {
        val st = readLine()!!.toString()
        if (st[1] == '+') {
            x++
        } else {
            x--
        }
    }
    println(x)
}