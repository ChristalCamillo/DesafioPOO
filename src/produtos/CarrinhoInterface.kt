package produtos

interface CarrinhoInterface {

    fun adicionaItem(produto: Produto)

    fun removeItem(codItem: Int)

    fun pegaValorProduto()

}