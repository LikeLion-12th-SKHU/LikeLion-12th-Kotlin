package lecture15

fun main() {

    var price = 8000

    var a = Book("빵야 대본집", 13000).apply {
        name = "[특가]" + name
        discount()
    }

    a.run {
        println("성퓸명 : ${name}, 가격 : ${price}원")
    }

    with(a) {
        println("성퓸명 : ${name}, 가격 : ${price}원")
    }

    a.let {
        println("성퓸명 : ${it.name}, 가격 : ${it.price}원")
    }
}

class Book (var name : String, var price : Int) {
    fun discount() {
        price -= 2000
    }
}