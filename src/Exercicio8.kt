

class Clientee(
    numeroCliente: Int,
    sobrenome: String,
    rg: String,
    cpf: String){
}

open class Contaa(
    var  cliente: Clientee,
    var deposito: Double,
    var sacar: Double,
    var saldo: Double) {


    fun fazerDeposito(valor: Double){
        saldo += valor}

    fun fazerSaque(valor: Double){
        saldo -= valor }

    fun consultarSaldo(valor: Double){
        return println(saldo) }
}

class ContaPoupanca(var cliente: Clientee , var saldo: Double , var taxaJuros: Float){

    fun depositarDinheiro(valor: Double){
        saldo += valor }

    fun sacarDinheiro(valor: Double){
        saldo -= valor
        when {valor <= saldo -> saldo -= valor
            else -> println("saldo insuficiente") }
        println(saldo) }


    fun recolherJuros(valor: Double){
        taxaJuros + saldo
        println(valor + saldo) }
 }






