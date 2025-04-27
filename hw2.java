fun main() {
    print("عدد اول را وارد کنید: ")
    val num1 = readLine()?.toDoubleOrNull() ?: 0.0

    print("عدد دوم را وارد کنید: ")
    val num2 = readLine()?.toDoubleOrNull() ?: 0.0

    val sum = num1 + num2
    val difference = num1 - num2
    val product = num1 * num2
    val quotient = if (num2 != 0.0) num1 / num2 else "تقسیم بر صفر مجاز نیست"

    println("جمع: $sum")
    println("تفریق: $difference")
    println("ضرب: $product")
    println("تقسیم: $quotient")
}
