
fun main(args: Array<String>){

    print("Digite o primeiro numero: ")
    val X =  readLine()!!.toInt()

    // NullPointerException

    print("Digite o segundo numero: ")
    val Y =  readLine()!!.toInt()

    val resultado = multiplica(X, Y)
    println("O resultado da operacão é = $resultado")
}

/*
    Metodo para somar dois numeros.
 */
fun soma(x: Int, y:Int) = x+y

/*
    Metodo multiplicador de dois numeros.
 */
fun multiplica(x: Int, y: Int) = x*y

fun dividir(x: Int, y: Int) = x/y

fun subtrair(x: Int, y: Int) = x-y