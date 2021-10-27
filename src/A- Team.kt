fun main() {
    val PEOPLE_NUM = 3
    val n = readLine()!!.toInt()

    val sures = Array(n){IntArray(PEOPLE_NUM)}
    for (i in 0 until sures.size) {
        for (j in 0 until PEOPLE_NUM) {
            sures[i][j] = readLine()!!.toInt()
        }
    }
    println(sures)
}