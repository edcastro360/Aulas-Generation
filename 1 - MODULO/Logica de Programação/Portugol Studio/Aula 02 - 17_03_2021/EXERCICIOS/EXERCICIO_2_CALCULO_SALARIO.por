programa
{
	funcao inicio()
	{
		real N, E, total
		cadeia C

		escreva("Insira o número de horas trabalhadas pelo funcionário: ")
		leia(N)

		se (N <= 50)
		{
			total = N*10
			escreva("\nSem excedente de horas registrado. Seu salário base é R$: ",total)
		}
		senao
		{
			E = (N-50)*20
			total = 50*10 + E
			escreva("\nO valor de salário excedente é R$: ",E, ".Seu salário total é R$: ",total)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 360; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */