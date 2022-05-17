package Menu

import Utils.MSG_FMT_INVALIDO
import Utils.MSG_OPC_INVALIDA
import carrinhoDeCompras.CarrinhoDeCompras
import produtos.bebidas.Refrigerante
import produtos.bebidas.Suco
import produtos.lanches.XBurger
import produtos.lanches.XSalada
import kotlin.system.exitProcess

open class Menu {
    init {

        val carrinhoDeCompras = CarrinhoDeCompras()
        menuInicial(carrinhoDeCompras)
    }

    private fun menuInicial(carrinhoDeCompras: CarrinhoDeCompras) {
        try {
            println(
                "Você deseja comprar:\n" +
                        "[1] Lanche\n" +
                        "[2] Bebida\n" +
                        "[3] Incluir, Editar ou Remover itens\n" +
                        "[4] Desejo sair do sistema"
            )
            when (readln().toInt()) {
                1 -> menuLanche(carrinhoDeCompras)
                2 -> menuBebida(carrinhoDeCompras)
                3 -> menuSecundario(carrinhoDeCompras)
                4 -> exitProcess(0)
                else -> throw NumberFormatException()
            }
        } catch (e: NumberFormatException) {
            MSG_FMT_INVALIDO
            menuInicial(carrinhoDeCompras)
        } catch (e: IllegalArgumentException) {
            MSG_OPC_INVALIDA
            menuInicial(carrinhoDeCompras)
        }

    }

    open fun menuSecundario(carrinhoDeCompras: CarrinhoDeCompras) {
        try {
            println("O que deseja fazer agora?\n" +
                    "[1] Incluir mais itens\n" +
                    "[2] Editar item do carrinho de compras\n" +
                    "[3] Remover item do carrinho de compras\n" +
                    "[4] Encerrar compra\n" +
                    "[5] Sair do sistema")
            when (readln().toInt()) {
                1 -> menuInicial(carrinhoDeCompras)
                2 -> {
                    carrinhoDeCompras.editarItem()
                    menuSecundario(carrinhoDeCompras)
                }
                3 -> {
                    carrinhoDeCompras.removeItem()
                    menuSecundario(carrinhoDeCompras)
                }
                4 -> {
                    exitProcess(0)
                }
                else -> throw NumberFormatException()
            }
        } catch (e: NumberFormatException) {
            MSG_FMT_INVALIDO
            menuSecundario(carrinhoDeCompras)
        } catch (e: IllegalArgumentException) {
            MSG_OPC_INVALIDA
            menuSecundario(carrinhoDeCompras)
        }
    }

    private fun menuBebida(carrinhoDeCompras: CarrinhoDeCompras) {
        try {
            println("Que bebida deseja comprar?\n" +
                    "[1] Refrigerante R$8.0\n" +
                    "[2] Suco R$6.0\n" +
                    "[3] Sair do sistema\n")
            when (readln().toInt()) {
                1 -> {
                    val refrigerante = Refrigerante()
                    refrigerante.criaRefrigerante(carrinhoDeCompras)
                }
                2 -> {
                    val suco = Suco()
                    suco.criaSuco(carrinhoDeCompras)

                }
                3 -> exitProcess(0)
                else -> throw NumberFormatException()
            }
        } catch (e: NumberFormatException) {
            println("Opção inválida! Tente novamente.")
            menuBebida(carrinhoDeCompras)
        } catch (e: IllegalArgumentException) {
            println("Formato inválido, para escolher o item, você deve informar o número dele.")
            menuBebida(carrinhoDeCompras)
        }
    }

    private fun menuLanche(carrinhoDeCompras: CarrinhoDeCompras) {

        try {
            println("Que lanche deseja comprar?\n" +
                    "[1] X-Burger R$10.0\n" +
                    "[2] X-Salada R$12.0\n" +
                    "[3] Sair do sistema\n")
            when (readln().toInt()) {
                1 -> {
                    val xBurger = XBurger("")
                    xBurger.criaXBurger(carrinhoDeCompras)
                    menuSecundario(carrinhoDeCompras)
                }
                2 -> {
                    val xSalada = XSalada()
                    xSalada.criaXSalada(carrinhoDeCompras)
                    menuSecundario(carrinhoDeCompras)
                }
                3 -> exitProcess(0)
                else -> throw NumberFormatException()
            }
        } catch (e: NumberFormatException) {
            MSG_OPC_INVALIDA
            menuLanche(carrinhoDeCompras)
        }

    }
}