package carrinhoDeCompras

import Utils.*
import produtos.Produto
import produtos.bebidas.Refrigerante
import produtos.bebidas.Suco
import produtos.lanches.XBurger
import produtos.lanches.XSalada
import kotlin.system.exitProcess

//a classe carrinho de compras serve para adicionar o código, quantidade, nome e
//valor do lanche e mostrar o valor total do pedido até aquele momento.
//O retorno do carrinho tem que ter um codigo GERADO AUTOMATICAMENTE, qtd de produtos e o valor

class CarrinhoDeCompras {

    val carrinhoDeCompras = mutableMapOf<Int, Produto>()
    var codigoDoProduto: Int = 1
    var totalFinal = 0

    private fun geraCodigoProduto(produto: Produto): Int {
        codigoDoProduto += 1
        carrinhoDeCompras[codigoDoProduto] = produto
        return codigoDoProduto
    }

    internal fun adicionaProdutoCarrinho(produto: Produto) {
        geraCodigoProduto(produto)
        mostraCarrinhoDeCompras()
    }

    fun mostraCarrinhoDeCompras() {
        if (carrinhoDeCompras.isEmpty()) {
            println("Seu carrinho está vazio, adicione produtos para continuar.")
        } else {
            println("*** Seu carrinho de compras ***\n")
            carrinhoDeCompras.forEach { (codigo, produto) ->
                println("Código: $codigo\n" +
                        "Tipo de produto: ${produto.nome}\n" +
                        "Valor unitário: ${produto.valor}\n" +
                        "Quantidade: ${produto.quantidade}\n" +
                        "Valor total dos produtos escolhidos: ${calcularValorProduto(produto.quantidade, produto.valor)}\n" +
                        "***\n")
                calculaValorTotal()
            }
        }
    }

    internal fun calcularValorProduto(quantidade: Int, valor: Int): Int {
        return valor * quantidade
    }

    internal fun calculaValorTotal(): Int {
        carrinhoDeCompras.forEach { (_, produto) ->
            totalFinal += calcularValorProduto(produto.quantidade, produto.valor)
        }
        mostraValorFinal(totalFinal)
        return totalFinal
    }

    private fun mostraValorFinal(totalFinal: Int) {
        println("Valor total do carrinho: $totalFinal\n")
    }

    internal fun removeItem() {
        try {
            println("Digite o código do produto que deseja excluir do carrinho")
            val codigo = readln().toInt()
            if (codigo < 0) {
                throw IllegalArgumentException()
            } else {
                if (codigo in carrinhoDeCompras) {
                    carrinhoDeCompras.remove(codigo)
                    mostraCarrinhoDeCompras()
                } else {
                    MSG_CODIGO_INEXISTENTE
                }
            }
        } catch (e: IllegalArgumentException) {
            MSG_VALOR_INVALIDO
            removeItem()
        } catch (e: NumberFormatException) {
            MSG_OPC_INVALIDA
            removeItem()
        } catch (e: UnsupportedOperationException) {
            MSG_CODIGO_INVALIDO
            removeItem()
        }

    }

    internal fun editarItem() {

        try {
            println("Digite o código do produto que deseja alterar")
            val codigo = readln().toInt()

            if (codigo < 0) {
                throw IllegalArgumentException()
            } else {
                if (codigo in carrinhoDeCompras) {

                    println("Que produto deseja escolher no lugar?\n" +
                            "[1] X-Burger\n" +
                            "[2] X-Salada\n" +
                            "[3] Refrigerante\n" +
                            "[4] Suco\n" +
                            "[5] Desistir da compra (sair do menu)")
                    when (readln().toInt()) {
                        1 -> {
                            val novoProduto = XBurger()
                            Utilitaria.solicitarQtd("Quantos XBurger?")
                            carrinhoDeCompras[codigo] = novoProduto
                            mostraCarrinhoDeCompras()
                        }
                        2 -> {
                            val novoProduto = XSalada()
                            Utilitaria.solicitarQtd("Quantos XSalada?")
                            carrinhoDeCompras[codigo] = novoProduto
                            mostraCarrinhoDeCompras()
                        }
                        3 -> {
                            val novoProduto = Refrigerante()
                            Utilitaria.solicitarQtd("Quantos Refrigerantes?")
                            carrinhoDeCompras[codigo] = novoProduto
                            mostraCarrinhoDeCompras()
                        }
                        4 -> {
                            val novoProduto = Suco()
                            Utilitaria.solicitarQtd("Quantos sucos?")
                            carrinhoDeCompras[codigo] = novoProduto
                            mostraCarrinhoDeCompras()
                        }
                        5 -> exitProcess(0)
                        else -> throw NumberFormatException()

                    }

                    println("*********************************************************")
                    mostraCarrinhoDeCompras()

                }
            }
        } catch (e: IllegalArgumentException) {
            MSG_VALOR_INVALIDO
            editarItem()
        } catch (e: NumberFormatException) {
            MSG_OPC_INVALIDA
            editarItem()
        } catch (e: UnsupportedOperationException) {
            MSG_CODIGO_INVALIDO
            editarItem()
        }

    }
}