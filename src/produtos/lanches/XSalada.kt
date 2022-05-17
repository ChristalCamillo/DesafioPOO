package produtos.lanches

import Menu.Menu
import Utils.Utilitaria
import Utils.VALOR_REFRI
import Utils.VALOR_XSALADA
import carrinhoDeCompras.CarrinhoDeCompras
import produtos.Produtos
import produtos.bebidas.Refrigerante

class XSalada(override var nome: String = "XSalada", override var quantidade: Int = 0, override var valor: Int = VALOR_REFRI, override var codigo: Int = 0) : Produtos(
    nome, quantidade, valor,
    codigo,
) {
    internal fun criaXSalada(carrinhoDeCompras: CarrinhoDeCompras) {

        val quantidade = Utilitaria.solicitarQtd("Digite quantos ${nome} você deseja comprar:")
        val valor = VALOR_XSALADA
        val XSalada = Refrigerante(nome, quantidade, valor, codigo)
        carrinhoDeCompras.adicionaProdutoCarrinho(XSalada)
        Menu()
    }
}