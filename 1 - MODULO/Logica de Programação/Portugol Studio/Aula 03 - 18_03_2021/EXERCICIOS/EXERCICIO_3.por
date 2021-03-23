programa
{

/*3- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, 
 * a média e o total de valores lidos. 
 * O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, 
 * o programa deve parar quando o usuário fornecer um valor negativo.*/
	
	funcao inicio()
	{
		inteiro num, contNum=0,somaNum=0
		real totalNum, mediaNum
		cadeia resultado 

		escreva("Insira um número: ")

		enquanto (x>=0)
		{
			escreva("Entre com um valor: ")
			leia(x)
			num = num + x
		}
			
		escreva("\nTotal do somatório: ",num)

		se(num==0)
		{
			escreva("Não posso fazer essa conta!")

		mediaNum = num / somaNum
		escreva("\nA média dos números digitados foi de: ",mediaNum)

		contNum++
		somaNum = somaNum + num
		escreva("\nO total de valores lidos é: ",contNum)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 497; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */