package produtos.lanches

import Utils.VALOR_REFRI
import produtos.Produtos

class XSalada(override var nome: String = "XSalada", override var quantidade: Int = 0, override var valor: Int = VALOR_REFRI) : Produtos() {
}