package lecture25

fun main() {

    val a = General("영빈", 173)

    println(a == General("영빈", 173))
    println(a.hashCode())
    println(a)

    val b = Data("영빈", 173)

    println(b == Data("재범", 177))
    println(b.hashCode())
    println(b)

    println(b.copy())
    println(b.copy("재웅"))
    println(b.copy(id = 178))

    val list = listOf(
        Data("영빈", 173),
        Data("재범", 177),
        Data("재웅", 178)
    )

    for ((a, b) in list) {
        println("${a}, ${b}")
    }

    var state = State.SING
    println(state)

    state = State.SLEEP
    println(state.isSleeping())

    state = State.EAT
    println(state.message)
}

class General(val name: String, val id: Int)

data class Data(val name: String, val id: Int)

enum class State(val message: String) {
    SING("노래를 부릅니다"),
    EAT("밥을 먹습니다"),
    SLEEP("잠을 잡니다");

    fun isSleeping() = this == State.SLEEP
}