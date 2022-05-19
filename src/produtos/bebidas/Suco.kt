package produtos.bebidas

import Utils.VALOR_SUCO
import produtos.Produto

class Suco : Produto {
    override fun retornaNome(): String = "Suco"
    override fun retornaValor(): Int = VALOR_SUCO
}