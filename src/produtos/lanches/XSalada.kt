package produtos.lanches

import Menu.Menu
import Utils.Utilitaria
import Utils.VALOR_XSALADA
import carrinhoDeCompras.CarrinhoDeCompras
import produtos.Produto
import produtos.bebidas.Refrigerante

class XSalada(override var nome: String = "XSalada", override var quantidade: Int = 0, override var valor: Int = VALOR_XSALADA, override var codigo: Int = 0) : Produto(
        nome, quantidade, valor, codigo
) {
    internal fun criaXSalada(carrinhoDeCompras: CarrinhoDeCompras) {

        val quantidade = Utilitaria.solicitarQtd("Digite quantos $nome você deseja comprar:")
        val valor = VALOR_XSALADA
        val XSalada = Refrigerante(nome, quantidade, valor, codigo)
        carrinhoDeCompras.adicionaProdutoCarrinho(XSalada)
        Menu()
    }
}