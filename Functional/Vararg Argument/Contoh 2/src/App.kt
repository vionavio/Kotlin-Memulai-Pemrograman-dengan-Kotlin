// main function
fun main() {
    sets(10, 10, name = "Kotlin")
}

fun sets(vararg number: Int, name: String): Unit {
    println(name)
    println (number.sum())
}