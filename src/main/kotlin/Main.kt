
fun main ( ) {

    println("INICIO DEL PROGRAMA")


    checarComidaLista()

    checarTipoComida()

    checarPrecio()

    calidadServicio()

    ofrecerBebida()

    contarDinero()

    println("FIN DEL PROGRAMA")

}

fun contarDinero(){

    println("¿Cuando dinero?")
    var dinero = readLine()!!.toInt()
    var contador = 1

    while (contador <= dinero ){

        println("SON $contador PESOS")

        contador += 1

    }

}

fun ofrecerBebida(){

    println("¿Quieres una bebida?\n1)SI \n2)NO")
    var respuesta = readLine()

    while (respuesta == "1"){

        println("PEDISTE UNA BEBIDA")

        println("¿Quieres otra bebida?\n1)SI \n2)NO")
        respuesta = readLine()

    }

}

fun calidadServicio(){

    val buenaAtencion = true
    val precio = 200
    val calidadComida = true

    if (buenaAtencion && precio <= 100 && calidadComida  ){
        println("EXCELENTE SERVICIO")
    }

    if (buenaAtencion || precio <= 100 || calidadComida){
        println("EL SERVICIO ESTUVO MAS O MENOS")
    }

    if ( buenaAtencion && calidadComida || precio <= 100){
        println("BUEN SERVICIO")
    }

    if (!buenaAtencion){
        println("NO HUBO BUENA ATENCION")
    }

}

fun checarComidaLista(){
    val comidalista = true
    if (comidalista){
        println("HIJO LA COMIDA YA LISTA")
    }
}

fun checarTipoComida(){

    // MEXICANA , CHINA, RAPIDA , POSTRE
    val tipo = "MEXICANA"

    if (tipo == "RAPIDA"){
        println("ESO ES MALO PARA TU SALUD")
    }else if (tipo == "CHINA"){
        println("EL RAMEN ES MUY DELICIOSO")
    }else if (tipo == "MEXICANA"){
        println("LA COMIDA MEXICANA ES LA MEJOR")
    }
}

fun checarPrecio(){

    val precio = 300
    val dinero = 300

    if(precio > dinero){
        println("NO TE ALCANZA")
    }else if (precio < dinero){
        println("SI TE ALCANZA, BIENVENIDO")
    }else if (precio == dinero){
        println("TE QUEDASTE EN CEROS")
    }
}


