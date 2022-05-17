package produtos.bebidas

import Menu.Menu
import Utils.Utilitaria
import Utils.VALOR_SUCO
import carrinhoDeCompras.CarrinhoDeCompras
import produtos.Produtos

class Suco(override var nome: String = "Suco", override var quantidade: Int = 0, override var valor: Int = VALOR_SUCO, override var codigo: Int = 0) : Produtos(
    nome, quantidade, valor,
    codigo,
) {
    internal fun criaSuco(carrinhoDeCompras: CarrinhoDeCompras) {

        val quantidade = Utilitaria.solicitarQtd("Digite quantos ${nome} você deseja comprar:")
        val valor = VALOR_SUCO
        val suco = Suco(nome, quantidade, valor, codigo)
        carrinhoDeCompras.adicionaProdutoCarrinho(suco)
        Menu().menuSecundario(carrinhoDeCompras)
    }


}