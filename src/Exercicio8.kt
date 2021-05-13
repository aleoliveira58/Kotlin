open class Client(
    var nDeCliente: String,
    var sobrenome: String,
    var rg: String,
    var cpf: String)

open class Cont(var saldo: Int, var deposito: Int, var sacarDinheiro: Int, var consultarSaldo: Int, client: Client)
{ fun depositoConta(valor: Int){
        saldo += valor
        println(saldo) }

   open  fun sacarDin(valor: Int){
        saldo -= valor
        println(saldo) }

    fun consultSaldo(valor: Int){
        println(saldo) }
}

private operator fun String.minusAssign(valor: Int) {}

class ContPoupanca(client: Client,
    var saldo: Int,
    var taxaJuros: Int){

    fun depositar(valor:Int){
        saldo += valor
        println(saldo) }

    fun sacar(valor: Int){
        saldo -= saldo
        println(saldo) }

    fun recolherJuros(valor: Int){
        taxaJuros + saldo
        println(saldo) }
}

class ContaCorrente(client: Client,
    var saldo: Int,
    var chequeEspecial: Int) {

    fun depositar(valor: Int) {
        saldo += valor
        println(saldo)
    }

    fun depositarCheque(valor: Int, bancoEmissor: String, dataPagamento: String) {
        saldo += valor
        println("Cheque no valor de R$$saldo depositado na data $dataPagamento pelo banco $bancoEmissor depositado.")
    }

    fun sacar(valor: Int) {
        when {
            valor <= saldo -> saldo -= valor
            else -> println("Usar $chequeEspecial")
        } }
}

fun main(){
 var usuario1 = Client("123" , "Machado" , "123456789" , "454-598-218-27" ,)
   var conta1 = Cont(100 , 200 , 20 , 280 , Client("123" ,
   "Machado", "123456789" , "454-598-218-27"))
    var contaPoupanca = ContPoupanca(Client("123" ,
        "Machado", "123456789" , "454-598-218-27") , 500 , 2)
    var contaCorrente = ContaCorrente(Client("123" ,
        "Machado", "123456789" , "454-598-218-27") , 200 , 500)






}

