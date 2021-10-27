fun main() {

    val n = readLine()!!.toInt()
    val m = readLine()!!.toInt()
    val a = readLine()!!.toInt()

    var countn = n / a.toLong()
    var countm = m / a.toLong()

    if (n % a != 0) ++countn

    if (m % a != 0) ++countm

    println(countn * countm)
}