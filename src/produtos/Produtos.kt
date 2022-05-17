package produtos

abstract class Produtos(var nome: String, var quantidade: Int, var valor: Int) {
    abstract fun valorProdutos(): Int
}