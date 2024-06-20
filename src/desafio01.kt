/*
Desafio:
Geronimo acredita que perde muito tempo lembrando qual número do mês representa cada um deles. Ele precisa de um
programa que mude os meses do ano do calendário do celular dele para facilitar e agilizar a leitura. Ajude-o e
faça um programa que, com uma determinada entrada de uma data, retorne essa data com o mês escrito por extenso.

Entrada:
As entradas serão datas em formato numeral. O dia ou mês que possuirem somente um digito, terão um 0 (zero) na
frente.

Saida:
As saídas serão as mesmas datas da entrada porém, com o mês escrito por extenso. O mês deve ter a primeira letra
em maiúsculo.

Exemplos:
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas.
Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

|    Entrada     |         Saída             |
| 19/10/1997	 |  19 de Outubro de 1997    |
| 25/12/2019	 |  25 de Dezembro de 2019   |
| 02/02/2020	 |  02 de Fevereiro de 2020  |
| 23/03/2003	 |  23 de Marco de 2003      |
 */

fun main() {
    print("Informe uma data (no padrão dd/mm/aaaa): ")
    val entrada: String? = readLine()

    // Utiliza o conceito de "destructuring" para atribuir cada parte da data (dia/mes/ano).
    // Referência: https://kotlinlang.org/docs/destructuring-declarations.html
    val (dia, mes, ano) = entrada!!.split("/")

    val mesPorExtenso = when (mes.toInt()) {

        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Março"
        4 -> "Abril"
        5 -> "Maio"
        6 -> "Junho"
        7 -> "Julho"
        8 -> "Agosto"
        9 -> "Setembro"
        10 -> "Outubro"
        11 -> "Novembro"
        12 -> "Dezembro"

        else -> "Mês Inválido!"
    }

    if (mesPorExtenso != "Mês Inválido!")
        println(entrada + " -> " + dia + " de " + mesPorExtenso + " de " + ano)
    else
        println(mesPorExtenso)
}