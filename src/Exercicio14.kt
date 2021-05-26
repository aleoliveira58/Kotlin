fun main(){

    var listaDeProduto = mutableListOf<Produto>()
    var camiseta = Fornecedor("Camiseta" , 40.0)
    var calca = Fornecedor("Calça" , 50.0)
    var blusa = Fornecedor("Blusa", 80.0)
    var bermuda = Fornecedor("Bermuda" , 30.0)
    listaDeProduto.add(camiseta)
    listaDeProduto.add(calca)
    listaDeProduto.add(blusa)
    listaDeProduto.add(bermuda)

    camiseta.armazenar()
    calca.armazenar()
    blusa.armazenar()
    camiseta.armazenar()
    bermuda.armazenar()
    println(listaDeProduto)




}




open class Produto(
    var descricao: String,
    var preco: Double
)

class Fornecedor(descricao: String, preco: Double) : Produto(descricao, preco) {
    fun armazenar() {}

    fun entrar() {
        println("O produto é $descricao e o preço é $preco)")
    }
}




