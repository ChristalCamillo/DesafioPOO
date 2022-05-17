package Menu

import produtos.Produtos
import kotlin.system.exitProcess

class Menu {
    fun menuPrincipal(produtos: Produtos) {

        try {
            println("BEM VINDE À LANCHONETE")
            println("Escolha a opção que deseja pedir:")
            println("1 - Lanche")
            println("2 - Bebida")
            println("3 - Sair do programa")

            when (readLine()!!.toInt()) {
                1 -> {
                    MenuLanches().opcoesDeProduto()
                    this.menuPrincipal(produtos)
                }
                2 -> {
                    MenuBebidas.o
                    this.menuPrincipal(estoque)
                }
                3 -> {
                    estoque.darBaixaItem()
                    this.menuPrincipal(estoque)
                }

                4 -> {
                    exitProcess(10)
                }
            }
        }
        catch (exception: Exception){
            println("Causa: ${exception.cause}")
            println("Mensagem: ${exception.message}")
            menuPrincipal(estoque)
        }
    }
}