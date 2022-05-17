package Menu

import Utils.Utilitaria
import carrinhoDeCompras.CarrinhoDeCompras
import kotlin.system.exitProcess

open class Menu {

    private var opcaoMenuInicial: Int = 0
    private var opcaoMenuLanches: Int = 0
    private var opcaoMenuBebidas: Int = 0
    private val carrinhoCompras = CarrinhoDeCompras()

    internal fun menuInicial() {

            println(
                "Você deseja:\n" +
                        "[1] Comprar Lanche\n" +
                        "[2] Comprar Bebida\n" +
                        "[3] Ir para o carrinho\n" +
                        "[4] Remover um pedido do carrinho\n" +
                        "[5] Desejo sair do sistema"
            )
            opcaoMenuInicial = Utilitaria.validarNumeroDigitado()
        when(opcaoMenuInicial){
            1 -> {
                menuLanches()
            }
            2 -> {
                menuBebidas()
            }
            3 -> {
                carrinhoCompras.mostrarProdutos()
                menuInicial()
            }
            4 -> {
                carrinhoCompras.removerProdutos()
                menuInicial()
            }
            5 -> {
                exitProcess(0)
            }
        }
    }

    private fun menuBebidas() {
        println(
            "Que bebida deseja comprar?\n" +
                    "[1] Refrigerante R$8.0\n" +
                    "[2] Suco R$6.0\n"
        )
        opcaoMenuBebidas = Utilitaria.validarNumeroDigitado()
        when(opcaoMenuBebidas){
            1 -> {
                carrinhoCompras.selecionarRefigerante()
                menuInicial()
            }
            2 -> {
                carrinhoCompras.selecionarSuco()
                menuInicial()
            }
        }
    }

    private fun menuLanches() {

            println("Que lanche deseja comprar?\n" +
                    "[1] X-Burger R$10.0\n" +
                    "[2] X-Salada R$12.0\n")
        opcaoMenuLanches = Utilitaria.validarNumeroDigitado()
        when(opcaoMenuLanches){
            1 -> {
                carrinhoCompras.selecionarXBurger()
                menuInicial()
            }

            2 -> {
                carrinhoCompras.selecionarXSalada()
                menuInicial()
            }
    }
}
}