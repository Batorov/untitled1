fun main(args: Array<String>) {
    val ops = arrayOf("+", "-", "*", "/")
    print("Please enter expression = ")
    val answer: String? = readLine()
    val parts = answer?.split(' ')
    val stack = mutableListOf<Double>()
    if (!parts.isNullOrEmpty()) {
        for (part in parts) {
            println(part)
        }
    }
}