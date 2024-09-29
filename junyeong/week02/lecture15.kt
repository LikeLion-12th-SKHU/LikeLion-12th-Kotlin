fun main(){

    var a = Book("준영의 코틀린", 10000).apply {
        name = "[초특가]" + name
        discount()
    }

    a.run {
        println("상품명: ${name}, 가격: ${price}원")
    }

}

class Book(var name: String, var price: Int){
    fun discount(){
        price -= 2000
    }
}