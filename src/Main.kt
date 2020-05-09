fun main(args: Array<String>) {

    //Se asignan varias variables en una sola linea
    //Y se pueden obtener las propiedades de un objeto
    //De una forma mas sencilla
    //Si en algun momento del objeto no necesitamos todas sus propiedades
    //como se muestra en  el campo en donde debe ir se pone un underScore _
    //y esto le dice a kotlin que no requerimos ese dato
    val (name, _, color) = Destructuration()

    val (resultado, status) = calcular(4,9)

    println("El resultado es: $resultado, \nEl status es: $status")

}

fun calcular(a: Int, b:Int): Result{
    if( a * 2 > b){
        return Result(a*2, true)
    }else{
        return Result(a, false)
    }
}