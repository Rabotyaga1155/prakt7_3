fun main(){
    try {
        println("Введите целое четырехзначное число")
        var x = readLine()!!.toInt()
        if (x<1000||x>9999){
            println("Введено не четырехзначное число")
        }
        else
        {
        var first = x % 10.toInt()
        var second = x / 10 % 10.toInt()
        var third = x / 100 % 10.toInt()
        var forth = x / 1000.toInt()
        var otvet = first * second * third * forth.toInt()
        println("Произведение цифер - $otvet")
        }
    }catch (e:Exception){
        println("Неверный ввод")}
}
