package lecture05

fun main() {
    var a = 24

    if (a > 10) {
        println("a는 10보다 크다")
    } else {
        println("a는 10보다 작거나 같다")
    }

    doWhen(1)
    doWhen("aaa")
    doWhen(12L)
    doWhen(3.14159)
    doWhen("Kotlin")
}

fun doWhen(a: Any) {
    when (a) {
        1 -> println("정수 1입니다.")
        "dimo" -> println("dimo의 코틀린")
        is Long -> println("Long 타입입니다.")
        !is String -> println("String 타입이 아닙니다.")
        else -> println("어떤 조건도 만족하지 않습니다.")
    }
}