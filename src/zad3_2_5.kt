fun main(){
    try {
        println("Введите число x")
        var x = readLine()!!.toDouble()
        println("Введите число y")
        var y = readLine()!!.toDouble()
        println("Введите число r")
        val r = readLine()!!.toDouble()
        if (r<=0){
            println("r не может быть меньше или равно 0")
        }
        else {
            var gip = Math.sqrt(x * 2 + y * 2)
            if (gip <= r) {
                println("Точка приналежит кругу")
            } else {
                println("Точка не пренадлежит кругу")
            }
        }
    }catch (e:Exception){
        println("Неверный ввод")
    }
}
