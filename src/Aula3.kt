fun main(){

    val bichano = Bichano()
    bichano.cor
    bichano.come()
    bichano.minhaRaca()
    println(bichano.minhaRaca())

    val gato = Gato()

    println(gato.sexo)

}

open class Animais(
    open var sexo: String = "0"){
    var cor = ""
    protected var raca = "Nenhuma"
    constructor(sexo: String , cor: String): this(sexo){
        this.cor = cor }

    //poliformismo
    open fun come(){
        println("come do jeito defaut") }
    fun minhaRaca(){
        println("Minha raca e $raca") } }



class Bichano: Gato(){
    override var sexo: String = "M"
    init { raca = "Gato" }
    override fun come() {
        super.come()
        println("Como do jeito bichano de ser") } }



 class Cachorro: Animais(
    sexo = "M"){}

open class Gato: Animais(
    sexo = "f",
    cor = "preto"){}

class Leao: Animais(){}







