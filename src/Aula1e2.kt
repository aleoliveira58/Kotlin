fun main() {

   val inteiro: Int = 1
    val inteiro2 = 2
    val numeroUltraGrande: Long = 56462626269644
    val texto = "Alessandro"
    val ehMaior = true
    val decimalMenor: Float = 2.0f
    val decimalMenor1 = 2.0f
    var decimalMaior = 2.5485498595959


    /* E           OU
    v v = v      v v = v
    v f = f      v f = v
    f v = f      f v = v
    f f = f      f f = f
     */

  /*meuNome()
 meuNomeCompleto("Alessandro" , "Machado")
 val nome = meuNomeCompletoComRetorno("Gabriel" , "Vinicius" )
 println(nome)*/


 // Questão 1 Escrever o codigo que deve analisar tres numeros inteiros e retorna o maior dele
//var num1 = 2
 //var num2 = 3
// var num3 = 4
// when {
 // num1 > num3 -> println("E menor")
 // num2 > num3 -> println("E menor")
 // else -> println("4")


 //Questao 2 escrever o codigo que deve analisar duas cadeias de texto e caso sejam diferentes retorna
 //true ou caso sejam iguais retorna false

 //var texto1: String = "alessandro"
 //var texto2: String = "Julia"
 //println(texto1 != texto2)

 //Questão 3 escrever o codigo que deve analisar um numero interio e caso ele seja par
 // retorna true caso contrario retorna false

// QUESTÃO 3 : val x = questao3 (5)
//  println(x)
navegarNoArray(mutableListOf("cachorro","gato"))
}


// QUESTÃO 3 : fun questao3( numero: Int): Boolean {
 //return numero % 2 == 0






fun meuNome() {
 println("Alessandro Machado")
}
fun meuNomeCompleto(nome: String , sobrenome: String){
 println ("$nome $sobrenome")
}
fun meuNomeCompletoComRetorno(nome: String , sobrenome: String): String {
 return "$nome $sobrenome" }

fun navegarNoArray(x : MutableList<String>){
 x.forEach {println(it)} }

