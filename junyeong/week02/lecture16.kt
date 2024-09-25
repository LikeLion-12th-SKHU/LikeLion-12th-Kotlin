 fun main(){

     println(Counter.count)

     Counter.countUp()
     Counter.countUp()

     println(Counter.count)

     Counter.clear()

     println(Counter.count)

 }
// Companion object 는 공통으로 공유함
 object Counter{
     var count = 0

     fun countUp(){
         count++
     }

     fun clear(){
         count = 0
     }
 }