package produtos.bebidas

import Menu.Menu
import Utils.Utilitaria
import Utils.VALOR_SUCO
import produtos.Produto

class Suco : Produto {
//    internal fun criaSuco() {
//
//        val quantidade = Utilitaria.solicitarQtd("Digite quantos $nome você deseja comprar:")
//        val valor = VALOR_SUCO
//        val suco = Suco(nome, quantidade, valor, codigo)
//        carrinhoDeCompras.adicionaProdutoCarrinho(suco)
//        Menu().menuSecundario(carrinhoDeCompras)
//    }

    override fun retornaNome(): String = "Suco"
    override fun retornaValor(): Int = VALOR_SUCO
}