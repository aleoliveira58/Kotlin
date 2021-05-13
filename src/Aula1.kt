fun main() {

 //val - imutável - não consigo alterar
 //var - mutável - consigo alterar
 val inteiro: Int = 1
 val inteiro2 = 2
 val numeroUltraGrande: Long = 3242342342342342343
 val texto: String = "César"
 val ehMaior: Boolean = true // false
 val decimalMenor: Float = 2.0f
 val decimalMenor1 = 2.0f
 var decimalMaior: Double =  2.28347238472398

 //5 / 2
 //println(2 == 1)

 /* E             OU
 v v = v         v v = v
 v f =  f        v f = v
 f v  = f        f v = v
 f f =  f        f f = f
  */

 //println(!false)

 println("Hello world!")
 decimalMaior = 2.0


 var pets = listOf("Cachorro", "Gato", "Tartaruga", "Ramster")
 val petsMutavel = mutableListOf("Cachorro", "Gato", "Tartaruga", "Peixe")
 petsMutavel.add("Ramster")
 println(petsMutavel.last())
 pets = listOf("Cobra", "Leão", "Onça", "Zebra")


 petsMutavel.forEach { pet ->
  println(pet)}

 val numero = 3

    when {
        numero < 3 -> println("Menor que 3")
        numero > 3 -> println("Maior que 3")
        else -> println("Caiu no else") }

    for (num in 1..100) {
        println(num) }


     var x = 0
   while (x <= 2) {
        println(x)
       x++   }
 /*
  0 x < 2 - 0
  1 x < 2 - 1
  2 x < 2
  */

    meuNome()
   meuNomeCompleto("Alessandro", "Machado")
   val nome = meuNomeCompletoComRetorno("Julia", "Gabriela")
   println(nome)
 navegarNoArray(mutableListOf("cachorro", "gato", "peixe"))


// Questão 1 :  Escrever o codigo que deve analisar tres numeros inteiros e retorna o maior dele
 val num1 = 2
 val num2 = 3
 val num3 = 4
 when {
 num1 > num3 -> println("E menor")
  num2 > num3 -> println("E menor")
  else -> println("4") }

//Questao 2 :  escrever o codigo que deve analisar duas cadeias de texto e caso sejam diferentes retorna
 //true ou caso sejam iguais retorna false

 var texto1: String = "Alessandro"
 var texto2: String = "Julia"
 println(texto1 != texto2)



//Questão 3 : escrever o codigo que deve analisar um numero interio e caso ele seja par
// retorna true caso contrario retorna false
 println(questao3(5))


 //Questão 4 : Escrever um programa que imprima na tela os primeiros 100 números
 //inteiros positivos ímpares.
 println(questao4())

 //Questão 5 : Escrever um código que deve analisar quatro números inteiros e, caso numA seja
 // maior que numC e numD ou caso numB seja maior que numC e numD, retornar
 // true, caso contrário, retornar false.
println(analisar(7 , 10 , 5 , 6))

 //Questão 6 : Escrever um programa que exiba os primeiros 100 números positivos.
//Função questão 6
 //fun imprimir100(){
  //for (n in 1..100){
  // println(n) }
 //}

}

fun meuNome() {
 meuNomeCompleto("Victor", "Motta")
 println("Cesar Rodrigues") }

fun meuNomeCompleto(nome: String, sobrenome: String): Unit {
 println("$nome $sobrenome") }

fun meuNomeCompletoComRetorno(nome: String, sobrenome: String): String {
 return "$nome $sobrenome" }

fun navegarNoArray(xpto: List<String>) {
 xpto.forEach {
  println(it) } }


// Função questao 3
fun questao3(numero: Int): Boolean {
 return numero % 2 == 0 }

// Função questao 4
fun questao4(){
 var cont = 0
 var numero = 1
 while (cont < 100){
  if (numero%2 != 0){
   println(numero)
   cont++ }
  numero++ }
}

//Função questão 5
fun analisar(numA: Int, numB: Int, numC: Int, numD: Int): Boolean{
 return (numA > numC ) && (numA > numD ) || (numB > numC) && (numB > numD)
}

//Função questão 6
fun imprimir100(){
 for (n in 1..100){
  println(n) }
}




