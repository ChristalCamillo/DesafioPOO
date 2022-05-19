package produtos.lanches

import Utils.VALOR_XSALADA
import produtos.Produto

class XSalada : Produto {
    override fun retornaNome(): String = "XSalada"
    override fun retornaValor(): Int = VALOR_XSALADA
}