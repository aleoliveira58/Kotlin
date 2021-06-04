fun main() {
    // Exercicio 1
    val loteriaDosSonhosMap = mapOf(
        0 to "Ovos",
        1 to "Agua",
        2 to "Escopeta",
        3 to "Cavalo",
        4 to "Dentista",
        5 to "Fogo"
    )

    // println(loteriaDosSonhosMap)

//Exercicio 1.2
    val apelidosMap = mapOf(
        "João" to listOf("Juan", "Fissura", "Maromba"),
        "Miguel" to listOf("Nigth Watch", "Bruce Wayne", "Tampinha"),
        "Maria" to listOf("Wonder Woman", "Mary", "Mariline"),
        "Lucas" to listOf("Lukinhas", "Jorge", "George")
    )
    //Meu jeito
//     apelidosMap.forEach(
//     ) {
//         println("O meu nome é ${it.key} é meus apelidos é ${it.value}")
//     }

    //Jeito do professor
//    apelidosMap.forEach{ entry ->
//        entry.value.forEach{ apelidos ->
//            println("${entry.key} - $apelidos ")
//        }
//
//    }

    //Exercicio2
    val inicializarList = listOf(1, 5, 5, 6, 7, 8, 8, 8)
    println(inicializarList)

    val inicializarSet = setOf(1, 5, 5, 6, 7, 8, 8, 8)
    println(inicializarSet)

    inicializarSet.forEach { set ->
        println(set)

    }
//Exercicio3
    val listaInteiros = setOf(1, 2, 3, 50, 60)
    val prova = Prova()
    val exercicio3 = Exercicio3()
    prova.somaTotal(listaInteiros)
    exercicio3.mostrarItens(listaInteiros)


    //Exercicio 4
    val peca1 = Peca("Adidas","Camiseta")
    val peca2 = Peca("Nike","Blusa")
    val peca3 = Peca("Balenciaga","Calça")
    val guarda = GuardaVolumes(mutableMapOf())
    guarda.guardaPecas(mutableListOf(peca1,peca2,peca3))
    guarda.mostrapecas()




}
//Exercicio 3
class Prova {

    fun somaTotal(ConjuntoInteiro: Set<Int>) {
        var somatotal = 0
        for (i in ConjuntoInteiro) {
            somatotal += i
        }
        println("O valor da soma total dos inteiros é $somatotal")

    }
}
// exerciccio 3
class Exercicio3{
    fun mostrarItens(ConjuntoInteiro: Set<Int>){
        ConjuntoInteiro.forEach{ entrada ->
            println("Os números são: $entrada")
        }
    }
}

//Exercicio 4
class GuardaVolumes(val dicionario: MutableMap<Int, MutableList<Peca>>) {
    var i: Int = 0
    fun guardaPecas(listaPecas: MutableList<Peca>): Int {
        dicionario.put(i, listaPecas)
        return i
    }
    fun mostrapecas() {
        var mostrarPecas = StringBuilder()
        dicionario.forEach { entry ->
            mostrarPecas.append("${entry.key} - ")
            entry.value.forEach{
                mostrarPecas.append("${it}, ")
            }
            mostrarPecas.appendLine()
        }
        println(mostrarPecas.toString())
    }
    fun mostrapecas(chave: Int) = println(dicionario[chave])
    fun devolverPeca(chave: Int) {
        dicionario.remove(chave)
        println("Peça devolvida com sucesso!")
    }
}
class Peca(var marca: String, var modelo: String) {
    override fun toString(): String {
        return "Pecas(marca='$marca', modelo='$modelo')"
    }
    open fun retirada (){
    }
}


