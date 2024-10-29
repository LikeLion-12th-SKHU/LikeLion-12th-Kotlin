package lecture26

fun main() {

    val a = mutableSetOf("자몽", "포도", "복숭아")

    for (item in a) {
        println("${item}")
    }

    a.add("귤")
    println(a)

    a.remove("포도")
    println(a)

    println(a.contains("자몽"))

    val b = mutableMapOf(
        "치치" to "파파rep",
        "써니보이" to "이탈리안 생존법칙",
        "스티비" to "런던으로"
    )

    for (entry in b) {
        println("${entry.key} : ${entry.value}")
    }

    b.put("플로렌스", "뉴욕드림")
    println(b)

    b.remove("치치")
    println(b)

    println(b["써니보이"])

}