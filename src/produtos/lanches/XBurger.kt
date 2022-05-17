package produtos.lanches

import Utils.VALOR_XBURGER
import produtos.Produtos

class XBurger(nome: String = "XBurger", quantidade: Int, valor: Int = VALOR_XBURGER) : Produtos(nome, quantidade, valor) {
    override fun valorProdutos(): Int {
        valor = quantidade* VALOR_XBURGER
        return this.valor
    }
}