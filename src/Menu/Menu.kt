package Menu

import Utils.MSG_FMT_INVALIDO
import Utils.MSG_OPC_INVALIDA
import Utils.Utilitaria.Utilitaria.solicitarQtd
import carrinhoDeCompras.CarrinhoDeCompras
import produtos.bebidas.Refrigerante
import produtos.bebidas.Suco
import produtos.lanches.XBurger
import produtos.lanches.XSalada
import kotlin.system.exitProcess

class Menu {
    private val carrinhoDeCompras = CarrinhoDeCompras()

    init {
        menuInicial()
    }

    private fun menuInicial() {
        try {
            println(
                "Você deseja comprar:\n" +
                        "[1] Lanche\n" +
                        "[2] Bebida\n" +
                        "[3] Incluir, Editar ou Remover itens\n" +
                        "[4] Desejo sair do sistema"
            )
            when (readln().toInt()) {
                1 -> menuLanche()
                2 -> menuBebida()
                3 -> menuSecundario()
                4 -> exitProcess(0)
                else -> throw NumberFormatException()
            }
        } catch (e: NumberFormatException) {
            MSG_FMT_INVALIDO
            menuInicial()
        } catch (e: IllegalArgumentException) {
            MSG_OPC_INVALIDA
            menuInicial()
        }

    }

    fun menuSecundario() {
        try {
            println("O que deseja fazer agora?\n" +
                    "[1] Incluir mais itens\n" +
                    "[2] Editar item do carrinho de compras\n" +
                    "[3] Remover item do carrinho de compras\n" +
                    "[4] Encerrar compra\n" +
                    "[5] Sair do sistema")
            when (readln().toInt()) {
                1 -> menuInicial()
                2 -> {
//                    carrinhoDeCompras.editarItem()
                    menuSecundario()
                }
                3 -> {
                    //carrinhoDeCompras.removeItem()
                    menuSecundario()
                }
                4 -> {
                    exitProcess(0)
                }
                else -> throw NumberFormatException()
            }
        } catch (e: NumberFormatException) {
            MSG_FMT_INVALIDO
            menuSecundario()
        } catch (e: IllegalArgumentException) {
            MSG_OPC_INVALIDA
            menuSecundario()
        }
    }

    private fun menuBebida() {
        try {
            println("Que bebida deseja comprar?\n" +
                    "[1] Refrigerante R$8.0\n" +
                    "[2] Suco R$6.0\n" +
                    "[3] Sair do sistema\n")

            val produto = when (readln().toInt()) {
                1 -> Refrigerante()
                2 -> Suco()
                3 -> exitProcess(0)
                else -> throw NumberFormatException()
            }

            val quantidadeDoProduto = solicitarQtd("Digite quantos ${produto.retornaNome()} você deseja comprar:")

            carrinhoDeCompras.adicionaItem(produto, quantidadeDoProduto)

            menuSecundario()
        } catch (e: NumberFormatException) {
            println("Opção inválida! Tente novamente.")
            menuBebida()
        } catch (e: IllegalArgumentException) {
            println("Formato inválido, para escolher o item, você deve informar o número dele.")
            menuBebida()
        }
    }

    private fun menuLanche() {

        try {
            println("Que lanche deseja comprar?\n" +
                    "[1] X-Burger R$10.0\n" +
                    "[2] X-Salada R$12.0\n" +
                    "[3] Sair do sistema\n")

            val produto = when (readln().toInt()) {
                1 -> XBurger()
                2 -> XSalada()
                3 -> exitProcess(0)
                else -> throw NumberFormatException()
            }

            val quantidadeDoProduto = solicitarQtd("Digite quantos ${produto.retornaNome()} você deseja comprar:")

            carrinhoDeCompras.adicionaItem(produto, quantidadeDoProduto)

            menuSecundario()

        } catch (e: NumberFormatException) {
            MSG_OPC_INVALIDA
            menuLanche()
        }
    }
}