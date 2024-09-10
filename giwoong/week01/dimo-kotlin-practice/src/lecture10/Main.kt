package lecture10

// 클래스의 상속

fun main() {
    var a = Animal("별이" ,5 , "개")
    var b = Dog("별이", 5)

    a.introduce()
    b.introduce()

    b.bork()

    var c = Cat("루이", 1)

    c.introduce()
    c.meow()
}

open class Animal(var name: String, var age: Int, var type: String) {
    fun introduce() {
        println("저는 ${type} ${name}이고, ${age}살 입니다.")
    }
}

class Dog(name: String, age: Int) : Animal(name, age, "개") {
    fun bork() {
        println("멍멍")
    }
}

class Cat(name: String, age: Int) : Animal(name, age, "고양이") {
    fun meow() {
        println("먀용먀용")
    }
}
