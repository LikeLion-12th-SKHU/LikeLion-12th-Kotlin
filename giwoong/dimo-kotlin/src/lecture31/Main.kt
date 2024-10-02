package lecture31

import kotlin.coroutines.*

// 코루틴을 통한 비동기 처리

fun main() {

    val scope = GlobalScope

    scope.launch {
        for (i in 1..5) {
            println(i)
        }
    }

    runBlocking {
        val a = launch {
            for (i in 1..5) {
                println(i)
                delay(10)
            }
        }
    }

    val b = async {
        "async 종료"
    }

    println("async 대기")
    println(b.await())

    println("launch 대기")
    a.join()
    println("launch 종료")
}