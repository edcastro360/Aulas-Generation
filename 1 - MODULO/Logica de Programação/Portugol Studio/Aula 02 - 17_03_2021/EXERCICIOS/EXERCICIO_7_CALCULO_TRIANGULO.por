programa
{
	
	funcao inicio()
	{
		real base, altura, area
		
				
		escreva("\nInsira um valor de base para o triângulo: ")
		leia(base)

		escreva("\nInsira um valor para a altura do triângulo: ")
		leia(altura)
		

		se(base > 0 e altura > 0)
		{
			area = (base * altura) / 2
			escreva("\nA área do triângulo é igual a: ", area)
		}
		senao
		{
			escreva("\nErro: Algum dos valores digitados não é valido!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 221; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */