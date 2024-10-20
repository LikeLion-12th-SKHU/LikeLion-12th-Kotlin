package lecture22

// null 값을 처리하는 방법? 동일한지를 확인하는 방법?

/*
?. -> null safe operator
객체가 null 인지 확인하고
객체가 null 이면 ?. 뒤에 있는 구문을 실행하지 않는다.

?: -> elvis operator
객체가 null 이 아니라면 그대로 사용하지만
객체가 null 이라면 ?: 뒤에 있는 구문을 사용한다.

!!. -> non-null assertion operator
참조 연산자를 사용할 때 null 여부를 컴파일시 확인하지 않도록하여
런타임시 null pointer exception 이 나도록 의도적으로 방치하는 연산자이다.
 */

fun main() {

    var a: String? = "Kotil Exam";

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
            return other.name == this.name && other.price == this.price
        } else {
            return false
        }
    }
}