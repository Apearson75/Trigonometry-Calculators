import kotlin.math.*

fun main() {
    println("sin/cos/tan ")
    val name = readLine()
    if (name.equals("sin")) {
        println("What number do you want to sin? ")
        val sine = readLine()?.toFloat()
        println(sine?.let { sin(it) })
    } else if (name.equals("cos")) {
        println("What number do you want to cosine? ")
        val cosine = readLine()?.toFloat()
        println(cosine?.let { cos(it)})
    } else if (name.equals("tan")) {
        println("What number do you want to tangent? ")
        val tangent = readLine()?.toFloat()
        println(tangent?.let { tan(it)})
    }
}