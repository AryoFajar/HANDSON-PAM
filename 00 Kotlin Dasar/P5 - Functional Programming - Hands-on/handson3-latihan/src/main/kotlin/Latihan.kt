fun makeCounter(): () -> Int {
    var count = 0
    return {
        count++
        count
    }
}

fun main() {
    val counterA = makeCounter()
    val counterB = makeCounter()

    println(counterA())
    println(counterA())
    println(counterA())

    println(counterB())
    println(counterB())
}