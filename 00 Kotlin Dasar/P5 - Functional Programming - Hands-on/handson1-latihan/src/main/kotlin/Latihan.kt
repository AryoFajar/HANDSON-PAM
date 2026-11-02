fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    // TODO 1: Panggil `operation` dengan a dan b, lalu kembalikan hasilnya
    return operation(a, b)
}

fun main() {

    val tambah = calculate(10, 4) { x, y -> x + y }
    println("Tambah: $tambah")

    val kurang = calculate(10, 4) { x, y -> x - y }
    println("Kurang: $kurang")

    val kali = calculate(10, 4) { x, y -> x * y }
    println("Kali: $kali")
}