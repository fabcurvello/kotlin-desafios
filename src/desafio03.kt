/*
Desafio:
Desenvolver um programa que determine em quantos anos a população do país A ultrapassará ou igualará a população do
país B. Para isso, considere as seguintes informações:

População Inicial: País A tem N habitantes e País B tem M habitantes, onde N é sempre menor que M.
Taxas de Crescimento Anual: País A cresce a uma taxa de 3% ao ano, enquanto País B cresce a uma taxa de 1.5% ao ano.

Cálculo Requerido: O programa deve calcular o número de anos necessários para que a população de A seja igual ou maior
que a de B, considerando as taxas de crescimento contínuas.

Observação: As taxas de crescimento devem ser aplicadas anualmente a partir das populações iniciais.


Entrada:
A entrada consiste em dois valores inteiros, sendo N a população do país A e M a população do país B.

Saída:
A saída consiste em retornar o número de anos necessários para que a população do país A ultrapasse ou iguale a
população B, mantidas as taxas de crescimento. Confira exemplo abaixo:

Exemplos:
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se
de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	   Saída
------------------
80000      16 anos
100000
------------------
100000     48 anos
200000
------------------
50000      22 anos
100000
------------------
 */


data class Pais(var habitantes: Double, val taxaCrescimento: Double) {
    fun crescerPopulacaoAnual() {
        //TODO("Criar a lógica de crescimento populacional, usando as propriedades do [Pais]")
        habitantes += (habitantes * taxaCrescimento/100)
    }
}

fun main() {
    print("Informe o número de habitantes do País A: ")
    val habitantesPaisA = readLine()!!.toDouble();

    print("Informe o número de habitantes do País B: ")
    val habitantesPaisB = readLine()!!.toDouble();

    val paisA = Pais(habitantesPaisA, taxaCrescimento = 3.0)
    val paisB = Pais(habitantesPaisB, taxaCrescimento = 1.5)

    var quantidadeAnos = 0
    while (paisA.habitantes < paisB.habitantes) {
        // TODO("Invocar a função que consolida o crescimento anual de cada [Pais]")
        paisA.crescerPopulacaoAnual()
        paisB.crescerPopulacaoAnual()

        //TODO("Garantir de a variável mutável $quantidadeAnos seja atualizada")
        quantidadeAnos ++
    }

    println("$quantidadeAnos anos")
    //println("População final País A: ${paisA.habitantes}")
    //println("População final País B: ${paisB.habitantes}")
}