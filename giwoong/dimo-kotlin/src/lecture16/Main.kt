package lecture16

// 객체를 직접 만드는 오브젝트

fun main() {

    println(Counter.count)

    Counter.countUp()
    Counter.countUp()

    println(Counter.count)

    Counter.clear()

    println(Counter.count)


    var a = FoodPool("짜장")
    var b = FoodPool("짬뽕")

    a.vote()
    a.vote()

    b.vote()
    b.vote()
    b.vote()

    println("${a.name} : ${a.count}")
    println("${b.name} : ${b.count}")
    println("총계 : ${FoodPool.total}")
}

object Counter {
    var count = 0

    fun countUp() {
        count++
    }

    fun clear() {
        count = 0
    }
}

class FoodPool (val name: String) {
    companion object {
        var total = 0
    }

    var count = 0

    fun vote() {
        total++
        count++
    }
}