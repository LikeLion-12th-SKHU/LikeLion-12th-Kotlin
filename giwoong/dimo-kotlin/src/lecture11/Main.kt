package lecture11

// 오버라이딩과 추상화

fun main() {

    var t = Tiger()

    t.eat()

    var r = Rabbit()

    r.eat()
    r.sniff()

    var d = Dog()

    d.run()
    d.eat()
}

// 오버라이딩
open class Animal {
    open fun eat() {
        println("음식을 먹습니다")
    }
}

class Tiger : Animal() {
    override fun eat() {
        println("고기를 먹습니다")
    }
}

// 추상화
abstract class Animal2 {
    abstract fun eat()
    fun sniff() {
        println("킁킁")
    }
}

class Rabbit : Animal2() {
    override fun eat() {
        println("당근을 먹습니다")
    }
}

interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("음식을 먹습니다")
    }
}

class Dog : Runner, Eater {
    override fun run() {
        println("우다다다 뜁니다")
    }

    override fun eat() {
        println("허겁지겁 먹습니다")
    }
}