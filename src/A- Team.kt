fun main() {
    val numberOfLines = readLine()!!.toInt()
    var implementations = 0
    for(line in 1..numberOfLines){
        val sum = readLine()!!.split(' ').map { num -> if (num.isNotEmpty()) num.toInt() else 0 }.sum()
        if (sum >= 2) implementations++
    }
    println(implementations)
}