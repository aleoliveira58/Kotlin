// Equals (comparação entre objetos e strings) - indica se algum outro objeto e "igual a" este.
// Equals sem sob escrever compara endereco de memoria
// Equals sob escrevendo com override compara  oque eu quiser
// Se for compara objetos dos mesmo tipo pode usar == na main
// Se for objetos diferentes tem que chamar o equals na main

fun main (){
   //Usando exemplos das classes da  aula 10 ferrari

    val ferrarif50 = Ferrari()//Exemplo de endereço de memoria : 1234
    val ferrarif70 = Ferrari()
    val ferrarif40 = Ferrari()// 4321
    ferrarif40.nome = "Ferrari Tesla"
    val ferrarif60 = ferrarif40 // 4321 e o mesmo endereco pq f60 esta vindo de f40

//    val nome1 = "Alessandro Machado"
//    val nome2 = "alessandro machado"
//    if (nome1 == nome2) { println("São iguais")}
//    else { println("São diferentes")}  //vai imprimir que são diferentes pq uma tem maiusclo e a outra não

//    val listaTeste = listOf("cesar" , "Cesar" , "Pedro" , "Edu")
//    println(listaTeste.sorted()) // Imprime a lista na  ordem, dando prefencia para letra Maiuscula vim primeiro
//    println(listaTeste.asReversed()) // Imprime a lista em outra ordem


//    println(ferrarif40.nome) // vai imprimir "Ferrari Tesla"
//    println(ferrarif60.nome)// vai imprimir "Ferrari Tesla" pq f60 esta vindo de f40

    ferrarif60.nome = "Ferrari Fiat"
//    println(ferrarif40.nome)// vai imprimir "Ferrari Fiat" pois mudou o nome do endereco de memoria f60
//    println(ferrarif60.nome)// vai imprimir "ferrari Fiat" pq mudou o f60

//    if (ferrarif50 == ferrarif40) {
//        println("São iguais") }
//    else { println("São diferentes") }

//    if (ferrarif60 == ferrarif40) {
//        println("São iguais") }
//    else { println("São diferentes") }

          // Usando equals criado na class ferrari da aula 10
    if (ferrarif50 ==  ferrarif70) {
        println("São iguais") }
    else { println("São diferentes") }




    //Equals : Comparações entre objetos e lista




}

