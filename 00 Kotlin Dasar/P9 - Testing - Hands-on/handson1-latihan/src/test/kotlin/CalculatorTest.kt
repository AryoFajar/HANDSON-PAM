import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class CalculatorTest {

    private val calculator = Calculator()

    @Test
    @DisplayName("Penjumlahan dua bilangan positif")
    fun testAdd() {
        val a = 2
        val b = 3

        val hasil = calculator.add(a, b)

        assertEquals(5, hasil)
    }

    @Test
    @DisplayName("Pengurangan yang menghasilkan angka negatif")
    fun testSubtractNegativeResult() {
        val a = 3
        val b = 5

        val hasil = calculator.subtract(a, b)

        assertEquals(-2, hasil)
    }

    @Test
    @DisplayName("Pembagian dua bilangan bulat")
    fun testDivide() {
        val a = 10
        val b = 2

        val hasil = calculator.divide(a, b)

        assertEquals(5, hasil)
    }
}