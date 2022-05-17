package produtos.lanches

import Utils.VALOR_XSALADA
import produtos.Produtos

class XSalada(nome: String = "XSalada", quantidade: Int, valor: Int = VALOR_XSALADA) : Produtos(nome, quantidade, valor) {
    override fun valorProdutos(): Int {
        valor = quantidade* VALOR_XSALADA
        return this.valor
    }
}