import kotlin.random.Random

fun main() {
    val a = generateSequence { Random.nextInt(1, 9) }
        .distinct()
        .take(4)
        .toSet()
    val b = a.toString().replace(" ", "")
        .replace(",", "")
        .replace("[", "")
        .replace("]", "")
    //println(b) //to show the generated number
    var m = 0
    val  c  = ""

    while (b != c) {
        val  c = readlnOrNull()
        for (i in 0..3) {
            if (b[i] == (c?.get(i) ?: return)) {
                m++
            }
        }
        val blist = b.toList()
        val clist = c?.toList()
        val interNum = clist?.intersect(blist.toSet())
        val n = interNum.toString().replace(" ", "")
            .replace(",", "")
            .replace("[", "")
            .replace("]", "")
            .length
        if (blist == clist) {
            println("well done, you guessed correctly")
            return
        }
         else println("$n : $m")
        m = 0
    }
}