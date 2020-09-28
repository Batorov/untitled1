import java.lang.StringBuilder

fun join(parts: Array<String>, separator: Char=','): String {
    val result = StringBuilder()
    for ((index, part) in parts.withIndex()) {
        result.append(part)
        if (index != parts.size - 1)
            result.append(separator)
    }

    return result.toString()
}

fun main(args: Array< String >) {
    print("please input int value ")
    val answer = readLine()
    println("Answer is \"$answer\"")
    val value = answer?.toInt()
    if (value != null) {
        if (value < 0){
            println("bad value")
        }
    }
}