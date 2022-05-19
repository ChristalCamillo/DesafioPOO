package produtos.bebidas

import Utils.VALOR_SUCO
import produtos.Produtos

class Suco(override var nome: String = "Suco", override var quantidade: Int = 0, override var valor: Int = VALOR_SUCO) : Produtos
{}