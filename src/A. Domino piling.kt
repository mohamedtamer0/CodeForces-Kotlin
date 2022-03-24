fun main() {
    val (length, width) = readLine()!!.split(' ').map { it.toInt() }
    val area = length * width
    var remain = area
    var dominos = 0
    while (remain >= 2) {
        remain -= 2
        dominos++
    }
    println(dominos)
}