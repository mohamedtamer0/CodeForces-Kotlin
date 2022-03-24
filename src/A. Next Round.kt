fun main() {
    val (participants, place) = readLine()!!.split(' ').map { it.toInt() }
    if ((1 <= place) && (place <= participants) && participants <= 50) {
        val scores = readLine()!!.split(' ').map { it.toInt() }
        val limit = scores[place - 1]
        val movingOn = scores.map { if (it >= limit && it > 0) 1 else 0 }.sum()
        println(movingOn)
    }

}