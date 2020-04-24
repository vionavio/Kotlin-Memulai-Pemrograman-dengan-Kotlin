// TODO 1
class Cat(private val name: String) {
    var sleep: Boolean = true
        get(){
            println("Fungsi getter dipanggil")
            return field
        }
        set(value){
            println("Fungsi setter dipanggil")
            field = value
        }

    fun toSleep() {
        if (sleep)
            println("$name, let's play!")
        else
        println("$name, sleep!")
    }

}

fun main() {

    // TODO 2
    val gippy = Cat("Gippy")

    gippy.toSleep()
    gippy.sleep = false
    gippy.toSleep()
}