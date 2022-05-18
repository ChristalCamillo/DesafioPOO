package carrinhoDeCompras

import Utils.*
import produtos.CarrinhoInterface
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

//    val produtosComCodigo = mutableMapOf<Int, List<Produto>>()
//    val carrinhoDeCompras = mutableMapOf<Int, Produto>()
    val produtos = mutableListOf<Produto>()
//    var codigoInicialDosProdutos: Int = 1

//    private fun geraCodigoProduto(produto: Produto): Int {
//        codigoInicialDosProdutos += 1
//        carrinhoDeCompras[codigoDoProduto] = produto
//        return codigoDoProduto
//    }

    fun adicionaItem(produto: Produto, quantidade: Int) {
        repeat(quantidade) {
            produtos.add(produto)
        }
//        geraCodigoProduto(produto)
        mostraCarrinhoDeCompras(quantidade)
    }

    fun mostraCarrinhoDeCompras(quantidade: Int) {
        if (produtos.isEmpty()) {
            println("Seu carrinho está vazio, adicione produtos para continuar.")
        } else {
            println("*** Seu carrinho de compras ***\n")
            produtos.groupBy {
                produto -> produto.retornaNome()
            }.forEach { (codigo, produtos) ->
                println("Código: $codigo\n" +
                        "Tipo de produto: ${produtos.first().retornaNome()}\n" +
                                "Valor unitário: ${produtos.first().retornaValor()}\n" +
                                "Quantidade: $quantidade\n" +
                                "Valor total dos produtos escolhidos: ${calcularValorProduto(quantidade, produtos.first().retornaValor())}\n" +
                                "***\n")
            }

            calculaValorTotal()
//            produtos.forEach { produto ->
//                println(/*"Código: $codigo\n" + */
//                        "Tipo de produto: ${produto.retornaNome()}\n" +
//                        "Valor unitário: ${produto.retornaValor()}\n" +
//                        "Quantidade: $quantidade\n" +
//                        "Valor total dos produtos escolhidos: ${calcularValorProduto(quantidade, produto.retornaValor())}\n" +
//                        "***\n")
//
//                calculaValorTotal(quantidade)
//            }
        }
    }

    private fun calcularValorProduto(quantidade: Int, valor: Int): Int {
        return valor * quantidade
    }

    private fun calculaValorTotal() {
        var totalFinal = 0

        produtos.forEach { produto ->
            totalFinal += produto.retornaValor()
        }

        mostraValorFinal(totalFinal)
    }

    private fun mostraValorFinal(totalFinal: Int) {
        println("Valor total do carrinho: $totalFinal\n")
    }

//    fun removeItem(codItem: Int) {
//        try {
//            println("Digite o código do produto que deseja excluir do carrinho")
//            val codigo = readln().toInt()
//            if (codigo < 0) {
//                throw IllegalArgumentException()
//            } else {
//                if (codigo in carrinhoDeCompras) {
//                    carrinhoDeCompras.remove(codigo)
//                    mostraCarrinhoDeCompras()
//                } else {
//                    MSG_CODIGO_INEXISTENTE
//                }
//            }
//        } catch (e: IllegalArgumentException) {
//            MSG_VALOR_INVALIDO
// //           removeItem()
//        } catch (e: NumberFormatException) {
//            MSG_OPC_INVALIDA
////            removeItem()
//        } catch (e: UnsupportedOperationException) {
//            MSG_CODIGO_INVALIDO
////           removeItem()
//        }
//
//    }
//
//    internal fun editarItem() {
//
//        try {
//            println("Digite o código do produto que deseja alterar")
//            val codigo = readln().toInt()
//
//            if (codigo < 0) {
//                throw IllegalArgumentException()
//            } else {
//                if (codigo in carrinhoDeCompras) {
//
//                    println("Que produto deseja escolher no lugar?\n" +
//                            "[1] X-Burger\n" +
//                            "[2] X-Salada\n" +
//                            "[3] Refrigerante\n" +
//                            "[4] Suco\n" +
//                            "[5] Desistir da compra (sair do menu)")
//                    when (readln().toInt()) {
//                        1 -> {
//                            val novoProduto = XBurger()
//                            Utilitaria.solicitarQtd("Quantos XBurger?")
//                            carrinhoDeCompras[codigo] = novoProduto
//                            mostraCarrinhoDeCompras()
//                        }
//                        2 -> {
//                            val novoProduto = XSalada()
//                            Utilitaria.solicitarQtd("Quantos XSalada?")
//                            carrinhoDeCompras[codigo] = novoProduto
//                            mostraCarrinhoDeCompras()
//                        }
//                        3 -> {
//                            val novoProduto = Refrigerante()
//                            Utilitaria.solicitarQtd("Quantos Refrigerantes?")
//                            carrinhoDeCompras[codigo] = novoProduto
//                            mostraCarrinhoDeCompras()
//                        }
//                        4 -> {
//                            val novoProduto = Suco()
//                            Utilitaria.solicitarQtd("Quantos sucos?")
//                            carrinhoDeCompras[codigo] = novoProduto
//                            mostraCarrinhoDeCompras()
//                        }
//                        5 -> exitProcess(0)
//                        else -> throw NumberFormatException()
//
//                    }
//
//                    println("*********************************************************")
//                    mostraCarrinhoDeCompras()
//
//                }
//            }
//        } catch (e: IllegalArgumentException) {
//            MSG_VALOR_INVALIDO
//            editarItem()
//        } catch (e: NumberFormatException) {
//            MSG_OPC_INVALIDA
//            editarItem()
//        } catch (e: UnsupportedOperationException) {
//            MSG_CODIGO_INVALIDO
//            editarItem()
//        }
//
//    }
//
//    override fun pegaValorProduto() {
//        TODO("Not yet implemented")
//    }
}