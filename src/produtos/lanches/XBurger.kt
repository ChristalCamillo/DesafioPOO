package produtos.lanches

import Utils.VALOR_XBURGER
import produtos.Produto

class XBurger : Produto {
    override fun retornaNome(): String = "XBurger"
    override fun retornaValor(): Int = VALOR_XBURGER
}