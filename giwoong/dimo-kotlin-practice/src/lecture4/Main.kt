package lecture4

// 타입추론과 함수

fun main() {

    // 타입 추론 -> 코드량을 줄임
    var a = 1234
    var b = 1234L

    var c = 12.45
    var d = 12.45f

    var e = 0xABCD
    var f = 0b01010101

    var g = true
    var h = 'c'

    // 함수 -> 특정한 동작을 하거나 원하는 결과값을 연산하는데 사용
    println(add1(5, 6, 7))
}

fun add1(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

fun add2(a:Int, b:Int, c:Int) = a + b + c