fun main(args: Array< String >) {
    val ops = hashMapOf("plus" to '+', "minus" to '-')
    println(ops.javaClass)

    for (op in ops) {
        println("${op.key} and its value ${op.value}")
    }

    for ((key, value) in ops) {
        println("$key and its value $value")
    }
}