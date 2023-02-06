fun main(){
    try {


        println("Введите высоту")
        var h = readLine()!!.toDouble()
        println("Введите радиус основания")
        var r = readLine()!!.toDouble()
        if (h<0||r<0) {
            println("Введите число больше нуля")
        }
else {
            var v = 3.14 * r * r * h
            println("Объем цилиндра - $v")
        }
        }catch (e:Exception){
        println("Неверный ввод")}

}
