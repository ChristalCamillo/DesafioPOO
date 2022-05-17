package produtos.bebidas

import Menu.Menu
import Utils.Utilitaria.Utilitaria.solicitarQtd
import Utils.VALOR_REFRI
import carrinhoDeCompras.CarrinhoDeCompras
import produtos.Produtos

class Refrigerante(override var nome: String = "Refrigerante", override var quantidade: Int = 0, override var valor: Int = VALOR_REFRI, override var codigo: Int = 0) : Produtos(
    nome, quantidade, valor,
    codigo,
) {
    internal fun criaRefrigerante(carrinhoDeCompras: CarrinhoDeCompras) {

        val quantidade = solicitarQtd("Digite quantos ${nome} você deseja comprar:")
        val valor = VALOR_REFRI
        val refrigerante = Refrigerante(nome, quantidade, valor, codigo)
        carrinhoDeCompras.adicionaProdutoCarrinho(refrigerante)
        Menu()
    }
}