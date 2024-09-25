package lecture17

fun main() {

    EventPrinter().start()
}

interface EventListner {
    fun onEvent(count: Int)
}

class Counter(var listner: EventListner) {

    fun count() {
        for(i in 1..100) {
            if (i % 5 == 0) listner.onEvent(i)
        }
    }
}

class EventPrinter: EventListner {
    override fun onEvent(count: Int) {
        print("${count}-")
    }

    fun start() {
        val counter = Counter(this)
        counter.count()
    }
}