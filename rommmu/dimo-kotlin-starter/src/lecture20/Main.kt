package lecture20

fun main() {

    val a = listOf("사과", "배", "감")
    println(a[1])

    for (frunt in a) {
        print("${frunt}:")
    }

    println()

    val b = mutableListOf(6, 3, 1)
    println(b)

    b.add(4)
    println(b)

    b.add(2, 8)
    println(b)

    b.removeAt(1)
    println(b)

    b.shuffle()
    println(b)
}