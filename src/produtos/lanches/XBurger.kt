package produtos.lanches

import Menu.Menu
import Utils.Utilitaria
import Utils.VALOR_XBURGER
import carrinhoDeCompras.CarrinhoDeCompras
import produtos.Produto
import produtos.bebidas.Refrigerante

class XBurger(override var nome: String = "XBurger", override var quantidade: Int = 0, override var valor: Int = VALOR_XBURGER, override var codigo: Int = 0) : Produto(
    nome, quantidade, valor, codigo
) {
    internal fun criaXBurger(carrinhoDeCompras: CarrinhoDeCompras) {

        val quantidade = Utilitaria.solicitarQtd("Digite quantos $nome você deseja comprar:")
        val valor = VALOR_XBURGER
        val xBurger = Refrigerante(nome, quantidade, valor, codigo)
        carrinhoDeCompras.adicionaProdutoCarrinho(xBurger)
        Menu()
    }
}