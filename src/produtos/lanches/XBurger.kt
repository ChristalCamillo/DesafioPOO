package produtos.lanches

import Menu.Menu
import Utils.Utilitaria
import Utils.VALOR_XBURGER
import produtos.Produto
import produtos.bebidas.Refrigerante

class XBurger : Produto {
//    internal fun criaXBurger() {
//
//        val quantidade = Utilitaria.solicitarQtd("Digite quantos $nome você deseja comprar:")
//        val valor = VALOR_XBURGER
//        val xBurger = Refrigerante(nome, quantidade, valor, codigo)
//        carrinhoDeCompras.adicionaProdutoCarrinho(xBurger)
//        Menu()
//    }

    override fun retornaNome(): String = "XBurger"
    override fun retornaValor(): Int = VALOR_XBURGER
}