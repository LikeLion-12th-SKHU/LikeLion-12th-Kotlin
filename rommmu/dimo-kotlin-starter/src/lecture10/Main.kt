package lecture10

fun main() {
    var a = Animal("영수" ,5 , "강아지")
    var b = Dog("희수", 5)

    a.introduce()
    b.introduce()

    b.bork()

    var c = Cat("구름이", 8)

    c.introduce()
    c.meow()
}

open class Animal(var name: String, var age: Int, var type: String) {
    fun introduce() {
        println("저는 ${type} ${name}이고, ${age}살 입니다.")
    }
}

class Dog(name: String, age: Int) : Animal(name, age, "강아지") {
    fun bork() {
        println("멍멍")
    }
}

class Cat(name: String, age: Int) : Animal(name, age, "고양이") {
    fun meow() {
        println("야옹")
    }
}