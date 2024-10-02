package lecture27

fun main() {
    val nameList = listOf("김재범", "최재웅", "이승현", "정민", "김지철")

    nameList.forEach{ print("$it ")}
    println()

    println(nameList.filter { it.startsWith("김") })

    println(nameList.map { "이름: $it" })

    println(nameList.any{ it == "홍승안"})
    println(nameList.all { it.length == 3 })
    println(nameList.none { it.startsWith("이") })

    println(nameList.first { it.startsWith("김") })
    println(nameList.last { it.startsWith("김") })
    println(nameList.count { it.contains("지") })
}