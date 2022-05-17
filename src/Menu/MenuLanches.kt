package Menu

import Utils.Utilitaria

class MenuLanches {
    fun opcoesDeProduto() {
        println("Escolha seu Lanche:")
        println("1 - XBurger - R$10.00")
        println("2 - XSalada - R$12.00")
        when(readln().toInt()){
            1 -> Utilitaria.solicitarQtd("Quantos XBurger deseja pedir?:")
            2 -> Utilitaria.solicitarQtd("Quantos XSalada deseja pedir?")
        }
    }
}