package net.skhu

fun main() {
    // Data의 class: 데이터를 다루는 데에 최적화된 class (함수가 제대로 구현 O)
    // equals(): 내용의 동일성 판단
    // hashcode(): 객체의 내용에서 고유한 코드 생성
    // toString(): 포함된 속성을 보기쉽게 나타냄
    // copy(): 객체를 복사하여 똑같은 내용의 새 객체를 만듦
    // componentX(): 속성을 순서대로 반환

    val a = General("보영", 212)

    println(a == General("보영", 212))
    println(a.hashCode())
    println(a)

    println()

    val b = Data("루다", 306)

    println(b == Data("루다", 306))
    println(b.hashCode())
    println(b)

    println()

    println(b.copy())
    println(b.copy("아린"))
    println(b.copy(id=618))

    println()

    val list = listOf(Data("가영", 100),
                    Data("나영", 200),
                    Data("다영", 300))

        for((a, b) in list)
        {
            println("${a}, ${b}")
        }

    println()

    // Enum(Enumerated type: 열거형)의 class: 상태 구분 (함수가 제대로 구현 X)

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

    fun isSleeping() = this == SLEEP
}


