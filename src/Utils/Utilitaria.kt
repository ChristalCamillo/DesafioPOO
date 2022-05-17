package Utils

class Utilitaria {
    companion object Utilitaria {

        fun solicitarQtd(mensagem: String): Int {
            return try {
                println(mensagem)
                val quantidade = readln().toInt()
                validarQtd(quantidade, mensagem)
            } catch (exeception: Exception) {
                println(MSG_VALOR_INVALIDO)
                solicitarQtd(mensagem)
            }
        }

        private fun validarQtd(quantidade: Int, mensagem: String): Int {
            return if (quantidade > 0) {
                quantidade
            } else {
                println(MSG_VALOR_INVALIDO)
                solicitarQtd(mensagem)
            }
        }

        fun validarNumeroDigitado(): Int {
            return try {
                var opcaoSelecionada = readln().toInt()
                while (opcaoSelecionada <= 0) {
                    println(MSG_OPC_INVALIDA)
                    opcaoSelecionada = readln().toInt()
                }
                opcaoSelecionada
            } catch (exception: NumberFormatException) {
                println(MSG_VALOR_INVALIDO)
                validarNumeroDigitado()
            }
        }
}}