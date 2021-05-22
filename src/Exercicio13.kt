abstract  class ContaBancaria {

    abstract var numeroConta: Int

    abstract var saldo: Double

    abstract fun sacar(valor: Double)

    abstract fun depositar(valor: Double)

}

class conCorrente(override var numeroConta: Int,
                  override var saldo: Double,
                  var taxaDeOperacao: Double): ContaBancaria() , Imprimivel{


    override fun sacar(valor: Double) {
        if (valor > (saldo - taxaDeOperacao)){
            println("Saldo insuficiente")
        } else { saldo -= valor + taxaDeOperacao
            println("Saque feito com sucesso") }
    }


    override fun depositar( valor: Double) {
        saldo += valor - taxaDeOperacao
        println("Deposito realizado com sucesso") }

    override fun mostrarDados() {
        println("O numero da conta é $numeroConta , o meu saldo é $saldo é a minha taxa de operação é $taxaDeOperacao")
    }


}

class contPoupanca(override var numeroConta: Int,
                   override var saldo: Double = 0.0 ,
                   var limite: Double): ContaBancaria(), Imprimivel{


    override fun sacar(valor: Double) {
        val saldoTotal = saldo + limite
        if (valor > saldoTotal) {
            println("Saldo insuficiente")
        } else {
            saldo -= valor
            println("Saque executado com sucesso") }
    }


    override fun depositar(valor: Double) {
        saldo += valor
        println("Depósito realizado com sucesso") }

    override fun mostrarDados() {
        println("O numero da conta é $numeroConta , o meu saldo é $saldo e o meu limite é $limite e o saldo" +
                "total é ${saldo + limite}")
    }


}

interface Imprimivel {

    fun mostrarDados()
}

class Relatorio {

    fun gerarRelatorio(imprimivel: Imprimivel) {
        imprimivel.mostrarDados()
    }
}











