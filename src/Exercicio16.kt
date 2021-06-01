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


}


