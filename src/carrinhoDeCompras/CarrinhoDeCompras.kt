package carrinhoDeCompras

import produtos.Produtos

//a classe carrinho de compras serve para adicionar o código, quantidade, nome e
//valor do lanche e mostrar o valor total do pedido até aquele momento.
//O retorno do carrinho tem que ter um codigo GERADO AUTOMATICAMENTE, qtd de produtos e o valor

class CarrinhoDeCompras {

    val carrinho = mutableMapOf<Int, ArrayList<Produtos>>()
    var codigoDoProduto: Int = 1
}