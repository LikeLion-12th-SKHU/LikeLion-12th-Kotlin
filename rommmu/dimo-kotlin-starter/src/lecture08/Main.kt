package lecture08

fun main() {
    var a = Person("주영빈", 2001)
    var b = Person("김지철", 1988)
    var c = Person("진태화", 1988)

    var d = Person("rommmu")

    a.introduce()
    b.introduce()
    c.introduce()
}

class Person(var name: String, val birthYear: Int) {
    init {
        println("${this.birthYear}년생 ${this.name}이 생성되었습니다.")
    }

    constructor(name: String) : this(name, 2001) {
        println("보조 생성자가 사용되었습니다.")
    }

    fun introduce() {
        println("안녕하세요, ${birthYear}년생 ${name}입니다.")
    }
}