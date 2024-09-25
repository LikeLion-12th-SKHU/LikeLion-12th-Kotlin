package lecture11

fun main() {

    var t = Tiger()

    t.eat()

    var r = Rommmu()

    r.speak()
    r.eat()

    var c = Cat()

    c.run()
    c.eat()
}

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

abstract class Person {
    abstract fun speak()
    fun eat() {
        println("밥을 먹습니다")
    }
}

class Rommmu : Person() {
    override fun speak() {
        println("안녕하세요")
    }
}

interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("밥을 먹습니다")
    }
}

class Cat: Runner, Eater {
    override fun run() {
        println("캣휠을 탑니다")
    }
}