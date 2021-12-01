fun main() {
    println("Hello Kotlin")


    for (i in 'a'..'z') {
        if (i.hashCode() % 2 == 0)
            print(i + " " )
    }

    println()

    val alphabet = listOf(
        "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
        "u", "v", "w", "x", "y", "z"
    )
    for (i in 1..alphabet.count() - 1 step 2) {
        print(alphabet[i] + " " )
    }




    println()




}