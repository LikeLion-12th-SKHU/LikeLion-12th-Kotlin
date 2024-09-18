package lecture04

fun main() {
    var a = 1234 // 일반 정수 리터럴
    var b = 1234L // L이 붙은 정수 리터럴

    var c = 12.45 // 일반 실수 리터럴
    var d = 12.45f // f가 붙은 실수 리터럴

    var e = 0xABCD // 16진수는 리터럴
    var f = 0b01010101 // 2진수는 리터럴

    var g = true
    var h = 'j'

    println(add(1,2,3))
}

fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c
}
// fun add(a: Int, b: Int, c: Int) = a + b + c