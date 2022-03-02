fun main(args: Array<String>) {
    //exercicio1()
    //exercicio2()
}

////////////EXERCÍCIO 1 - TAXA DE NATALIDADE/MORTALIDADE

fun exercicio1():Unit {

    println("Digite 1 para taxa de natalidade ou 2 para taxa de mortalidade")
    println("Ou digite 0 para cancelar")

    when(readLine()!!.toInt()){
        1 -> {
            println("Digite o número de nascimentos da cidade em questão:")
            val births = readLine()!!.toInt()
            println("Digite a população aproximada da cidade em questão:")
            val population = readLine()!!.toInt()
            val birthRate:Int = ((births * 1000) / population)
            println("A taxa de natalidade da cidade em questão é de $birthRate.")
        }

        2 -> {
            println("Digite o número de mortes da cidade em questão:")
            val deaths = readLine()!!.toInt()
            println("Digite a população aproximada da cidade em questão:")
            val population = readLine()!!.toInt()
            val mortRate:Int = ((deaths * 1000) / population)
            println("A taxa de mortalidade da cidade em questão é de $mortRate.")
        }

        0 -> println("Operação cancelada.")

        else -> println("<OPÇÃO INVÁLIDA>")
    }

}

////////////EXERCÍCIO 2 - PAGAMENTO

fun exercicio2():Unit {

    println("Digite o valor total da compra:")
    val price = readLine()!!.toFloat()
    println("Escolha método de pagamento:")
    println("1 - A Vista")
    println("2 - A Prazo")
    println("3 - Parcelado")

    when(readLine()!!.toInt()){
        1 -> {
            val checkout:Float = (price*0.9f)
            System.out.printf("O valor a pagar é de: %.2fR$",checkout)
        }
        2 -> {
            val checkout:Float = (price*1.03f)
            System.out.printf("O valor a ser pago futuramente é de: %.2fR\$",checkout)
        }
        3 -> {
            println("Digite quantas parcelas em que você deseja pagar:")
            val parcel:Byte = readLine()!!.toByte()
            val checkout:Float = ((price*1.015f)/parcel)
            System.out.printf("O valor a pagar é de: %.2fR$ Por Mês.",checkout);
        }
        else -> println("<OPÇÃO INVÁLIDA>")
    }
}