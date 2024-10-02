package lecture22

fun main() {

    var a: String? = "Kotlin Exam";

    println(a?.toUpperCase())

    println(a?:"default".toUpperCase())

    println(a!!.toUpperCase())

    a?.run{
        println(toUpperCase())
        println(toLowerCase())
    }

    var b = Product("콜라", 1000)
    var c = Product("콜라", 1000)
    var d = b
    var e = Product("사이다", 1000)

    println(b == c)
    println(b === c)

    println(b == d)
    println(b === d)

    println(b == e)
    println(b === e)
}

class Product(val name: String, val price: Int) {
    override fun equals(other: Any?): Boolean {
        if (other is Product) {
            return other.name == name && other.price == price
        } else {
            return false
        }
    }
}