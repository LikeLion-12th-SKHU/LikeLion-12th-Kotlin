package lecture5

// 조건문과 비교연산자

fun main() {

    var a = 11

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

    doWhen2(1)
    doWhen2("aaa")
    doWhen2(12L)
    doWhen2(3.14159)
    doWhen2("Kotlin")
}

fun doWhen(a: Any) {
    when (a) {
        1 -> println("정수 1입니다")
        "aaa" -> println("강좌.")
        is Long -> println("Long 타입")
        !is String -> println("String 타입 X")
        else -> println("Nothing")
    }
}

fun doWhen2(a: Any) {
    var result = when (a) {
        1 -> "정수 1입니다"
        "aaa" -> "강좌."
        is Long -> "Long 타입"
        !is String -> "String 타입 X"
        else -> "Nothing"
    }

    println(result)
}