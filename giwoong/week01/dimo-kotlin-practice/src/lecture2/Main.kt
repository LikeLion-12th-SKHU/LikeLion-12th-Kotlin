package lecture2

// 변수와 자료형

fun main() {
    var a: Int
    a = 123

    println(a)

    var b: Int? = null

    println(b)

    var intValue: Int = 1234
    var longValue: Long = 1234L
    var intValueByHex: Int = 0x1a
    var intValueByBin: Int = 0b10110110

    var doubleValue: Double = 123.5
    var doubleValueWithExp: Double = 123.5e10
    var floatValue: Float = 123.5f

    var charValue: Char = 'a'
    var koreanCharValue: Char = '가'

    var booleanValue: Boolean = true

    var stringValue = "one line string test"

    var multiLineStringValue = """multiline
        string
        test
    """""
}