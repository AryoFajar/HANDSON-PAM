class Box<T>(val value: T) {
   fun <R> map(transform: (T) -> R): Box<R> {
        return Box(transform(value))
    }
}

fun main() {
    val intBox = Box(23)
    println("intBox.value = ${intBox.value}")

    val cupBox = Box("cup") // Tipe parameter bisa di-infer
    println("cupBox.value = ${cupBox.value}")

    val stringBox = intBox.map { "Angka: $it" }
    println("stringBox.value = ${stringBox.value}")

    val lengthBox = cupBox.map { it.length }
    println("lengthBox.value = ${lengthBox.value}")
}