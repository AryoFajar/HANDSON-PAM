fun describeProfile(nama: String, umur: Int?, kota: String = "Tidak diketahui"): String {
    val umurText = umur?.let { "$it tahun" } ?: "umur tidak diketahui"
    return "Nama: $nama, Umur: $umurText, Kota: $kota"
}

fun main() {
    println(describeProfile("Andi", 20, "Bandar Lampung"))
    println(describeProfile("Budi", null))
    println(describeProfile(nama = "Citra", umur = 19))
}