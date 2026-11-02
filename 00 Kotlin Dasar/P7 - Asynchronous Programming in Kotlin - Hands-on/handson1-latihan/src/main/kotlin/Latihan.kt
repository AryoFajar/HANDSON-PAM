import kotlinx.coroutines.*

suspend fun checkOrderStatus(orderId: String): String {
    delay(2000)
    return "Order $orderId: SHIPPED"
}

fun main() = runBlocking {
     println("Menunggu status pesanan...")

    val status = checkOrderStatus("A100")
    println(status)
}