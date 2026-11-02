import kotlinx.coroutines.*

suspend fun writeAccessLog(message: String) {
    delay(500)
    println("[LOG] $message")
}

suspend fun calculateTotalPrice(prices: List<Int>): Int {
    delay(700)
    return prices.sum()
}

fun main() = runBlocking {
    val prices = listOf(15000, 25000, 10000)

    launch {
        writeAccessLog("Checkout dimulai")
    }

    val totalDeferred: Deferred<Int> = async {
        calculateTotalPrice(prices)
    }

    val total = totalDeferred.await()
    println("Total belanja: Rp$total")
}