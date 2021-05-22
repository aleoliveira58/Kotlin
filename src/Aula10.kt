fun main() {

    val ferrariF50 = Ferrari()
    ferrariF50.acelerar()
    ferrariF50.monitorEstilizado()
}

abstract class Automovel {

    abstract val nome: String

    abstract fun acelerar()

    abstract fun frear()

    abstract fun monitorEstilizado()
}

class Ferrari: Automovel() {

    override var nome: String = "hsdds"

    var  motor = "530cv"

    var cor = "Vermelho"

    override fun acelerar() {
        println("Uma ferrari acelerando")
    }

    override fun frear() {
        println("Uma ferrari freando")
    }

    override fun monitorEstilizado() {
        println("Monitor estilizado")
    }

//Aula 12 Equals
     // Aqui o equals esta comparando o nome
    override fun equals(other: Any?): Boolean {
        val outraFerrari = other as? Ferrari
        return when(other){
            is Ferrari -> { this.nome == outraFerrari?.nome}
            
           // is Double -> true   // Para comparar com um double
            else -> {
                super.equals(other)} } }

          // Outro exemplo

    //override fun equals(other: Any?): Boolean {
//    return if (other is Ferrari) { true }
//    else { false  }}


    //to string imprime a representação que vc quer dar
    //super e para imprimir endereço de memoria
    //sem o super vc pode escrever oque quiser no retorno

    override fun toString(): String {
        return "O meu nome e $nome, minha potencia e $motor de cavalor e minha cor é $cor"
    }

    //hash code imprime a o endereço de memoria com Int
    //sem equals o hash code vai imprimir os mesmo endereco
    //quando sob escreve o equals vai imprimir outro inteiro de endereco de memoria mesmo sendo iguais
    // se o endereco de memoria do objetos for iguais  mesmo com equals vai dar o mesmo inteiro no hash code

    override fun hashCode(): Int {
        return super.hashCode()
    }

}
