fun main() {
    var st1: String
    var st2: String

    val x = readLine()!!.toInt()

    for (i in 0 until x) {
        st1 = readLine()!!.toString()

        if (st1.length > 10) {

            st2 = st1.substring(1, st1.length - 1)
            println(st1[0].toString() + "" + st2.length + "" + st1[st1.length - 1])
        } else println(st1)
    }
}