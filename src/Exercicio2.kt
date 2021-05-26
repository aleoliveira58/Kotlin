import java.util.concurrent.TimeUnit
//fun main() {
//
//    //Exercicios 1 CLiente e conta (part3)
//    var clien1 = Cliente("Alessandro", "Machado")
//    var clien2 = Cliente("Gabirel", "Vinicius")
//
//    var conta1 = Conta(13, 1500.00, Cliente("Alessandro", "Machado"))
//    conta1.deposito(500)
//    conta1.saque(200)
//
//    var conta2 = Conta(15, 2500.00, Cliente("Gabriel", "Vinicius"))
//    conta2.deposito(1000)
//    conta2.saque(500)
//         // Fim exercicio 1 (part4)
//
//
//
//
//    // Exercicio 2 (part 3)
//    val jogador1 = JogadoreFutebol("Alessandro" , 50 , 100 , 20 , 10)
//    val jogador2 = JogadoreFutebol("Gabriel", 40 , 90 , 10 , 5)
//
//    val treinamento1 = SessaoDeTreinamento(20)
//    treinamento1.treinar(jogador1)
//    treinamento1.treinar((jogador2))
//     // Fim Exercicio 2 (part 4)
//
//
//
//
//// Exercicio 3 (part3)
// var atleta1 = Atleta("Igor" , 20 , 10)
// var atleta2 = Atleta("João" , 30 , 20)
//
//    var prova1 = Prova(5, 10,)
//    var prova2 = Prova(20, 30)
//    var prova3 = Prova(30,30)
//    println(prova1.podeRealizar(atleta1))
//    println(prova2.podeRealizar(atleta1))
//    println(prova3.podeRealizar(atleta1))
//
//    println(prova1.podeRealizar(atleta2))
//    println(prova2.podeRealizar(atleta2))
//    println(prova3.podeRealizar(atleta2))
//    // Fim Exercicio 3 (part 4)
//
//
//    //Exercicio 4 (part3)
//    var tripe = Tripe(false , 0 , 10 , 5)
//    println(tripe.prontoParaGuardar())
//    println(tripe.prontoParaUsar())
//    tripe.desdobrado()
//    tripe.dobrar()
//    tripe.usar()
//    tripe.guardar()
//    tripe.definirAltura(6)
//
//    println(tripe.alturaAtual)
//    //Exercicio 4 (part4)
//
//
//
//    //Exercicio 5 (part3)
//    val carro = Carro("Fiat", "Uno",2016, "Preto", 25265)
//    val cliente = Clientes("Alessandro" , "Machado", 987687527  )
//    val concessionaria = Concessionaria()
//    val venda1 = registroVendas(23500.0, carro, cliente)
//
//    concessionaria.registrarVenda(venda1)
//
//    concessionaria.listaDeVenda.forEach { println(it) }
//    //Exercicio 5 (part4)
//
//
//
//}
//
////Começo Exercicio 1 (part1)
//class Cliente(var nome: String , var sobrenome: String){
//}
//
//class Conta (var numeroConta: Int , var saldo: Double , var titular: Cliente){
//    fun deposito(valor: Int){
//        saldo += valor
//        println(saldo)}
//    fun saque(valor: Int){
//        when {valor <= saldo -> saldo -= valor
//            else -> println("saldo insuficiente") }
//        println(saldo) } }
////Fim Exercicio 1 (part2)
//
//
//
//
////Exercicio 2 Jogadores e Treinamento (part1)
//
//class JogadoreFutebol(
//    var nome: String ,
//    var energia: Int ,
//    var alegria: Int ,
//    var gols: Int ,
//    var experiencia: Int){
//
//    fun fazerGol(){
//        energia -= 5
//        alegria -= 10
//        gols += 1
//        println("GOOOOOL") }
//
//    fun correr(){
//        energia -= 10
//        println("Cansei") } }
//
//class SessaoDeTreinamento(
//    var experiencia: Int){
//
// fun treinar (jogador: JogadoreFutebol){
//    println("Experiencia Inicial: ${jogador.experiencia}")
//    jogador.correr()
//    jogador.fazerGol()
//    jogador.correr()
//    jogador.experiencia += 1
//    println("Experiência Final: ${jogador.experiencia}") }}
//// Fim Exercicio 2 (part2)
//
//
//
//
//// Exercicios 3 (part1)
//class Atleta(
//    var nome: String ,
//    var nivel: Int ,
//    var energia: Int){}
//
//class Prova(
//    var dificuldade: Int ,
//    var energiaNecessaria: Int,){
//
//    fun podeRealizar(atleta: Atleta): Boolean{
//      return (atleta.nivel >= dificuldade) && (atleta.energia >= energiaNecessaria) }
//}// Fim exercicio 3 (part2)
//
////Exercicio 4 (part1)
//class Tripe (
//    var dobrado: Boolean ,
//    var alturaMinima: Int ,
//    var alturaMaxima: Int ,
//    var alturaAtual: Int){
//
//    fun definirAltura(novaAltura: Int){
//        alturaAtual = novaAltura }
//
//    fun dobrar(){
//        dobrado = true }
//
//    fun desdobrado(){
//        dobrado = false }
//
//    fun guardar(){
//        dobrar()
//        alturaAtual = alturaMinima }
//
//    fun prontoParaGuardar(): Boolean{
//        return (dobrado && (alturaAtual == alturaMinima)) }
//
//    fun usar(){
//        desdobrado()
//        alturaAtual = (alturaMaxima / 2) + 1 }
//
//    fun prontoParaUsar(): Boolean {
//        return !dobrado && (alturaAtual >= alturaMaxima / 2) } }
//// Exercicio 4 (part2)
//
//
//
////Exercicio 5 (part1)
//class Carro(
//    marca: String,
//    modelo: String,
//    anoFabricacao: Int,
//    cor: String,
//    quilometragem: Int){}
//
//class Clientes(
//    nome: String,
//    sobrenome: String,
//    contato: Int){}
//
//class Concessionaria {
//    var listaDeVenda = mutableListOf<registroVendas>()
//
//    fun registrarVenda(venda: registroVendas) {
//        listaDeVenda.add(venda) } }
//
//
//class registroVendas(
//    valorDaVenda: Double,
//    veiculoVendido: Carro,
//    clientes: Clientes){
//
//    override fun toString(): String {
//        var valorDaVenda = ""
//        return "Valor da Venda: $valorDaVenda" }}
////Exercicio 5 (part 2)










