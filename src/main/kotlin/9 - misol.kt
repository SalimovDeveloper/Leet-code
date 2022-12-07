import java.util.*

fun main() {
//    Palidrom sonlar

    println(isPalidrom(1))

}

private fun isPalidrom(x: Int): Boolean {
    if (x < 0) return false
    if (x < 10) return true
// 1 - usul
//    var empty = 0
//    var kesh = x
//
//    while (kesh != 0) {
//        empty *= 10
//        empty += kesh % 10
//        kesh /= 10
//    }
//
//    return x==empty

//    2 usul
    return x.toString() == x.toString().reversed()
}