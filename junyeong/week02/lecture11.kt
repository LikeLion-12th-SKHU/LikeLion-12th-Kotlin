fun main(){

    val r = Rabbit()

    r.eat()
    r.sniff()
}

abstract class Animal{
    abstract fun eat()
    fun sniff(){
        println("킁킁")
    }
}

class Rabbit: Animal(){
    override fun eat(){
        println("당근을 먹습니다.")
    }
}