package carrinhoDeCompras

import Utils.*
import produtos.Produtos
import produtos.bebidas.Refrigerante
import produtos.bebidas.Suco
import produtos.lanches.XBurger
import produtos.lanches.XSalada

//a classe carrinho de compras serve para adicionar o código, quantidade, nome e
//valor do lanche e mostrar o valor total do pedido até aquele momento.
//O retorno do carrinho tem que ter um codigo GERADO AUTOMATICAMENTE, qtd de produtos e o valor

class CarrinhoDeCompras {

    private val carrinhoDeCompras = mutableMapOf<Int, ArrayList<Produtos>>()
    private var codigoDoProduto: Int = 0

    private fun guardarProdutoCarrinho(listaProdutos: ArrayList<Produtos>): Int {
        codigoDoProduto += 1
        carrinhoDeCompras[codigoDoProduto] = listaProdutos
        return codigoDoProduto
    }

    fun mostrarProdutos() {
        if (carrinhoDeCompras.isEmpty()) {
            println("Carrinho de compras vazio")
        } else {
            carrinhoDeCompras.forEach { (chave, valor) ->
                println("Código do produto: $chave")
                valor.forEach {
                    println("${it.quantidade} ${it.nome} - Valor total: R$ ${it.quantidade * it.valor}")
                }
            }
        }
    }

    fun removerProdutos() {
        println("Digite o código do item que deseja remover")
        val numero = Utilitaria.validarNumeroDigitado()
        if (carrinhoDeCompras.containsKey(numero)) {
            carrinhoDeCompras.remove(numero)
            println("Item removido do carrinho")
        } else {
            println("Código não encontrado")
        }
    }

    internal fun selecionarXBurger() {
        val qnt = Utilitaria.solicitarQtd("Quantos XBurger?")
        val xBurger = XBurger("XBurger", qnt, VALOR_XBURGER)
        val listaProdutos: ArrayList<Produtos> = ArrayList()
        listaProdutos.add(xBurger)
        guardarProdutoCarrinho(listaProdutos)
    }

    internal fun selecionarXSalada() {
        val qnt = Utilitaria.solicitarQtd("Quantos XSalada?")
        val xSalada = XSalada("XSalada", qnt, VALOR_XSALADA)
        val listaProdutos: ArrayList<Produtos> = ArrayList()
        listaProdutos.add(xSalada)
        guardarProdutoCarrinho(listaProdutos)
    }

    internal fun selecionarRefigerante() {
        val qnt = Utilitaria.solicitarQtd("Quantos Refrigerantes?")
        val refigerante = Refrigerante("Refrigerante", qnt, VALOR_REFRI)
        val listaProdutos: ArrayList<Produtos> = ArrayList()
        listaProdutos.add(refigerante)
        guardarProdutoCarrinho(listaProdutos)
    }

    internal fun selecionarSuco() {
        val qnt = Utilitaria.solicitarQtd("Quantos sucos?")
        val suco = Suco("Suco", qnt, VALOR_SUCO)
        val listaProdutos: ArrayList<Produtos> = ArrayList()
        listaProdutos.add(suco)
        guardarProdutoCarrinho(listaProdutos)
    }

}