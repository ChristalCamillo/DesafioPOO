package produtos.bebidas

import Menu.Menu
import Utils.Utilitaria.Utilitaria.solicitarQtd
import Utils.VALOR_REFRI
import produtos.CarrinhoInterface
import produtos.Produto

class Refrigerante : Produto {

//    internal fun criaRefrigerante() {
//        var carrinho: CarrinhoInterface
//        val quantidade = solicitarQtd("Digite quantos $nome você deseja comprar:")
//        val valor = VALOR_REFRI
//        val refrigerante = Refrigerante(    nome, quantidade, valor, codigo)
//        carrinho.adicionaItem(refrigerante)
//        Menu()
//    }

    override fun retornaNome(): String = "Refrigerante"

    override fun retornaValor(): Int = VALOR_REFRI
}