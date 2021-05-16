//Classes Abstratas
fun main() {
     var ingresso1 = Normal()
    println("Digite 1 para ingresso $ingresso1")


    var ingresso2 = Vip()
    println("Digite 2 para ingresso $ingresso2")

    var vip1 = CamaroteSuperior(15.00)
    println("Digite 1 para superior ")

    var vip2 = CamaroteInferior("Setor B ")
    println("Digite 2 para inferior")





}



abstract class Ingresso {

    abstract fun imprimirValor()


}

open class Vip( var valor: Int = 5): Ingresso() {


    override fun imprimirValor()  { var ingresso = 10
        return println(valor + ingresso )  }

    override fun toString(): String {
        return "Vip"
    }




}

class Normal: Ingresso(){
    override fun imprimirValor() {
    println("Ingresso Normal")}

     override fun toString(): String {
        return "Normal"
    }
}

class CamaroteInferior(
    var localizacao: String): Vip(){
        fun acessarLocalizacao(){
            println("Sua localização e $localizacao") } }

class CamaroteSuperior(
    var valorAdicional: Double): Vip(){
        fun retornarValorAdicional(){
            return println(valor + valorAdicional) } }








