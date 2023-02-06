fun main(){
    try {
    println("Введите число k")
    var k = readLine()!!.toDouble()
    println("Введите число b")
    var b = readLine()!!.toDouble()
    println("Введите число c")
    var c = readLine()!!.toDouble()
    println("Введите число d")
    var d = readLine()!!.toDouble()
    println("Введите число x")
    var x = readLine()!!.toDouble()
    var y1 = k*x+b
    var y2 = c*x+d
    println("Координаты y1 - $y1\nКоординаты y2 - $y2")
    }catch (e:Exception){
        println("Неверный ввод")
    }
}