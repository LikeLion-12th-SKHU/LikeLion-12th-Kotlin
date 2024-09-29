package lecture14

// 고차함수와 람다함수

fun main() {

    b(::a)

    val c: (String) -> Unit = { str -> println("$str 람다함수")}
    b(c)

}

fun a(str: String) {
    println("$str 함수 a")
}

fun b(function: (String) -> Unit) {
    function("b가 호출한")
}