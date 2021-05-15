




abstract class Ingresso {

    abstract fun imprimirValor()


}

open class Vip( var valor: Int = 5): Ingresso() {
    override fun imprimirValor() { var ingresso = 10
        return println(valor + ingresso ) } }

class Normal: Ingresso(){
    override fun imprimirValor() {
    println("Ingresso Normal")} }

class CamaroteInferior(
    var localizacao: String): Vip(){
        fun acessarLocalizacao(){
            println("Sua localização e $localizacao") } }

class CamaroteSuperio(
    var valorAdicional: Double): Vip(){
        fun retornarValorAdicional(){
            return println(valor + valorAdicional) } }








