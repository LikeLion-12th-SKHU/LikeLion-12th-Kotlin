package lecture28

fun main() {

    data class Person(val name: String, val birthYear: Int)

    val personList = listOf(
        Person("김재범", 1979),
        Person("최재웅", 1979),
        Person("이승현", 1977),
        Person("김지철", 1988)
    )

    println(personList.associateBy { it.birthYear })
    println(personList.groupBy { it.name })

    val (over85, under85) = personList.partition { it.birthYear > 1985 }
    println(over85)
    println(under85)

    val numbers = listOf(-3, 7, 2, -10, 1)

    println(numbers.flatMap { listOf(it * 10, it + 10) })

    println(numbers.getOrElse(1) { 50 })
    println(numbers.getOrElse(10) { 50 })

    val names = listOf("A", "B", "C", "D")

    println(names zip numbers)
}