package lecture25

// Data Class 와 Enum Class

/*
데이터 클래스는 데이터를 다루는데 최적화
1. equals() 자동구현
2. hashcode() 자동구현
3. toString() 자동구현
4. copy() 자동구현
5. componentX() 자동구현
 */

fun main() {

    val a = General("보영", 212)

    println(a == General("보영", 212))
    println(a.hashCode())
    println(a)

    val b = Data("루다", 306)

    println(b == Data("루다", 306))
    println(b.hashCode())
    println(b)

    println(b.copy())
    println(b.copy("아린"))
    println(b.copy(id = 618))

    val list = listOf(
        Data("보영", 212),
        Data("루다", 306),
        Data("아린", 618)
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