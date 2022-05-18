package produtos.lanches

import Menu.Menu
import Utils.Utilitaria
import Utils.VALOR_XSALADA
import produtos.Produto
import produtos.bebidas.Refrigerante

class XSalada : Produto {
//    internal fun criaXSalada() {
//
//        val quantidade = Utilitaria.solicitarQtd("Digite quantos $nome você deseja comprar:")
//        val valor = VALOR_XSALADA
//        val XSalada = Refrigerante(nome, quantidade, valor, codigo)
//        carrinhoDeCompras.adicionaProdutoCarrinho(XSalada)
//        Menu()
//    }

    override fun retornaNome(): String = "XSalada"
    override fun retornaValor(): Int = VALOR_XSALADA
}