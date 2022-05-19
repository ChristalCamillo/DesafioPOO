package produtos.bebidas

import Utils.VALOR_REFRI
import produtos.Produto

class Refrigerante : Produto {
    override fun retornaNome(): String = "Refrigerante"

    override fun retornaValor(): Int = VALOR_REFRI

}