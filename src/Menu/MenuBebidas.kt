package Menu

import Utils.Utilitaria
import produtos.bebidas.Refrigerante

class MenuBebidas {
    fun opcoesDeProduto() {
        println("Escolha a sua bebida")
        println("1 - Refrigerante - R$8.00")
        println("2 - Suco - R$6.00")
        when(readln().toInt()){
            1 -> Utilitaria.solicitarQtd("Quantos refrigerantes deseja pedir?:")
            Refrigerante(quantidade = s)
            2 -> Utilitaria.solicitarQtd("Quantos sucos deseja pedir?")
        }
    }
}