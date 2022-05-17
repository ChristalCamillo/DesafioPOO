package produtos.bebidas

import Utils.VALOR_REFRI
import produtos.Produtos

class Refrigerante(nome: String = "Refrigerante", quantidade: Int, valor: Int = VALOR_REFRI) : Produtos(nome, quantidade, valor) {
    override fun valorProdutos(): Int {
         valor = quantidade*VALOR_REFRI
        return this.valor
    }
}