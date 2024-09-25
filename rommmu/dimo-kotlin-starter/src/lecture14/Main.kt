package lecture14

fun main() {

    b(::a)

    val c: (String) -> Unit = { str -> println("$str 람다함수") }
    // { str: String -> println("$str 람다함수")

    b(c)
}

fun a (str: String) {
    println("$str 힘수 a")
}

fun b (function: (String) -> Unit) {
    function("b가 호출한")
}