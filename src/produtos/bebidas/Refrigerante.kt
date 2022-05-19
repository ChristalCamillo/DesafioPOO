package produtos.bebidas

import Utils.VALOR_REFRI
import produtos.Produtos

class Refrigerante(override var nome: String = "Refrigerante", override var quantidade: Int = 0, override var valor: Int = VALOR_REFRI):
    Produtos {
}