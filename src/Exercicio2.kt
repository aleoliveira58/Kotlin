import java.util.concurrent.TimeUnit

//Exercicios 7 Cliente e conta

class Cliente(var nome: String , var sobrenome: String){
}

class Conta (var numeroConta: Int , var saldo: Double , var titular: Cliente){
    fun deposito(valor: Int){
        saldo += valor
        println(saldo)}
    fun saque(valor: Int){
        when {valor <= saldo -> saldo -= valor
            else -> println("saldo insuficiente") }
        println(saldo) } }

class Exercicio1

 fun main() {
    var clien1 = Cliente("Alessandro", "Machado")
    var clien2 = Cliente("Gabirel", "Vinicius")

    var conta1 = Conta(13, 1500.00, Cliente("Alessandro", "Machado"))
    conta1.deposito(500)
    conta1.saque(200)

    var conta2 = Conta(15, 2500.00, Cliente("Gabriel", "Vinicius"))
    conta2.deposito(1000)
    conta2.saque(500) }


//Exercicio 2 Jogadores e treinamento

class JogadoreFutebol(
    var nome: String ,
    var energia: Int ,
    var alegria: Int ,
    var gols: Int ,
    var experiencia: Int){

    fun fazerGol(){
        energia -= 5
        alegria -= 10
        gols += 1
        println("GOOOOOL") }

    fun correr(){
        energia -= 10
        println("Cansei") }
}

class SessaoDeTreinamento(
    var experiencia: Int)
fun treinar(jogador: JogadoreFutebol){
    println("Experiencia Inicial: ${jogador.experiencia}")
    jogador.correr()
    jogador.fazerGol()
    jogador.correr()
    jogador.experiencia += 1
    println("Experiência Final: ${jogador.experiencia}") }

//fun main(){
//    var joga11 = JogadoreFutebol("Alessandro", 200,500, 50,100)
//    println(joga11)
//}










