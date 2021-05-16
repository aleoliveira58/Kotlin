fun main(){

    val alessandro = Clientee(123 , "Machado" , "39509862-2" , "454-598-218-27")
    val contaPoupancaCaixa = ContaPoupanca(cliente = alessandro)
    contaPoupancaCaixa.depositarDinheiro(200.00)
    println(contaPoupancaCaixa.sacarDinheiro(50.00))


    val contaCorrenteItau = ContaCorrente(cliente = alessandro , 200.00, 150.00)
    println(contaCorrenteItau.depositarCheque(100.00, "Santander" , "12-04-2021"))





}

 class Clientee(
    numeroCliente: Int,
    sobrenome: String,
    rg: String,
    cpf: String){
}

open class Contaa(
    var cliente: Clientee){
    open var saldo: Double = 0.0

    fun fazerDeposito(valor: Double){
        saldo += valor
        println("Seu novo saldo é $saldo") }


   open fun fazerSaque(valor: Double){
        saldo -= valor
    println("Seu novo saldo é $saldo") }

    fun consultarSaldo(valor: Double){
        return println(saldo) }


}

class ContaPoupanca(cliente: Clientee , var taxaJuros: Double = 3.5): Contaa(cliente = cliente ){

    fun depositarDinheiro(valor: Double){
        saldo += valor
    println("Seu novo saldo é $saldo")}

    fun sacarDinheiro(valor: Double){
        saldo -= valor
        when {valor <= saldo -> saldo -= valor
            else -> println("saldo insuficiente") }
        println("Seu novo saldo é $saldo") }


    fun recolherJuros(valor: Double){

        saldo *= taxaJuros
        println("Meu novo saldo é $saldo") }

    // ou posso fazer
    //val juros = saldo * (taxaJuros / 100)
   // saldo += juros
    //println("Meu novo saldo é $saldo")
}

  class ContaCorrente(cliente: Clientee , var chequeEspecial: Double , var cheque: Double): Contaa(cliente = cliente){

     fun depositarDinheiro(valor: Double){
         saldo += valor
         println("Seu novo saldo é $saldo")}

     fun depositarCheque(valor: Double , bancoEmissor: String , dataDePagamento: String){
         saldo += cheque
         println("Seu novo saldo é ") }

     override fun fazerSaque(valor: Double) {
         saldo -= valor
         when { valor < saldo -> chequeEspecial }
         println("Seu novo saldo é $saldo") }
 }






