package produtos.bebidas

import Utils.VALOR_SUCO
import produtos.Produtos

class Suco(nome: String = "Suco", quantidade: Int, valor: Int = VALOR_SUCO) : Produtos(nome, quantidade, valor) {
    override fun valorProdutos(): Int {
        valor = quantidade* VALOR_SUCO
        return this.valor
    }
}