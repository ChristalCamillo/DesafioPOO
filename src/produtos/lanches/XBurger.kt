package produtos.lanches

import Utils.VALOR_REFRI
import produtos.Produtos

class XBurger(override var nome: String = "XBurger", override var quantidade: Int = 0, override var valor: Int = VALOR_REFRI) : Produtos() {
}