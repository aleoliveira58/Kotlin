fun main () {
    val bichano = Bichano()
    bichano.come()
    bichano.minhaRaca()
    println(bichano.sexo) // vai imprimir Masculino pq tem override

    val gato = Gato()
    gato.minhaRaca()
    println(gato.sexo) // vai imprimir Feminino




}
//Bichano -> Gato -> Animal
class Bichano: Gato(){

    override val sexo: String = "Masculino"

    override fun come() {
        super.come()
        println("Come do jeito bichano de ser") }


    init{ raca = "Gatinho" } }  // init para mudar oque esta falando na classe pai


class Cachorro: Animal(sexo = "Masculino") {}

open class Gato: Animal(
    sexo = "Feminino",
    cor = "Preto")





class Leao: Animal() {}



open class Animal(
   open  val sexo: String = "O"
) {
    var cor = "Nenhuma"
    protected open var raca = "Nenhuma" // protected deixa usar variaveis  nas calsses filha e não na fun main

    constructor(sexo: String, cor: String) : this(sexo) {
        this.cor = cor
    }


    open fun come() {
        println("Come do jeito defaut")
    }

     fun minhaRaca() {
         println("Minha raça e $raca") }

}


//private deixar usar variaveis so na classe pai e não passa pras filhas
// override sob escreve a classe ( polimorfismo)


