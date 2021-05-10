// class Aula2e2 (){
// val numero = 0
// var nome: String = "Alessandro"
// fun teste() {
// }
// }


class Animal(
   //Construtor primario
    val nome: String,
    val tipo: String){

//Construtor Secundario sempre vindo com base no construtor primario
    constructor(nome: String , tipo: String , reino: String) : this(nome, tipo)

    //Construtor 3 sempre com outras assinaturas
    constructor(nome: String, tipo: String , tamanho: Int): this(nome, tipo)

    val nomeETipo = "$nome - $tipo"

    init {}

    //var teste1 = "Execuçao 1"
    ///init { println(teste1) }

    //var teste2 = "Execucao 2"
    //init { println(teste2) }
fun sobre () { println (nomeETipo) }

    fun comer() {} }

fun main() {
    val cachorro = Animal("Penellopy" , "Cachorro")
    cachorro.sobre()
    val bichano = Animal("Caramujo", "Gato", "Mamifero")
    val perebas = Animal("Bob", "Peixe" , tamanho = "5")
}
