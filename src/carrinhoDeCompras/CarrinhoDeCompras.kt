package carrinhoDeCompras

import produtos.Produto

//a classe carrinho de compras serve para adicionar o código, quantidade, nome e
//valor do lanche e mostrar o valor total do pedido até aquele momento.
//O retorno do carrinho tem que ter um codigo GERADO AUTOMATICAMENTE, qtd de produtos e o valor

class CarrinhoDeCompras {

    val produtosComCodigo = hashMapOf<Int, Produto>()
//    val carrinhoDeCompras = mutableMapOf<Int, Produto>()
    val produtos = mutableListOf<Produto>()
//    var codigoInicialDosProdutos: Int = 1

    fun adicionaItem(produto: Produto, quantidade: Int) {
        repeat(quantidade) {
            produtos.add(produto)
        }
        geraCodigoProdutos(produtos)
        mostraCarrinhoDeCompras(quantidade)
    }

    private fun geraCodigoProdutos(produtos: MutableList<Produto>) {
        var codigo = 0
        produtos.forEach {
            produtosComCodigo[++codigo] = it
        }

        //carrinhoDeCompras[codigoDoProduto] = produto
        //codigoInicialDosProdutos += 1
        //return codigoDoProduto
    }

    private fun mostraCarrinhoDeCompras(quantidade: Int) {
        if (produtos.isEmpty()) {
            println("Seu carrinho está vazio, adicione produtos para continuar.")
        } else {
            println("*** Seu carrinho de compras ***\n")
            produtosComCodigo.forEach { (codigo, produto) ->
                println("Código: $codigo\n" +
                        "Tipo de produto: ${produto.retornaNome()}\n" +
                        //"Tipo de produto: ${produtos.first().retornaNome()}\n" +
                        "Valor unitário: ${produto.retornaValor()}\n" +
                        //"Valor unitário: ${produtos.first().retornaValor()}\n" +
                        "Quantidade: $quantidade\n" +
                        "Valor total dos produtos escolhidos: ${calculaValorProduto(quantidade, produto.retornaValor())}\n" +
                        //"Valor total dos produtos escolhidos: ${calculaValorProduto(quantidade, produtos.first().retornaValor())}\n" +
                        "***\n")
            }
            calculaValorTotal()
        }
    }

    private fun calculaValorProduto(quantidade: Int, valor: Int): Int {
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