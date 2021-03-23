programa
{
	inclua biblioteca Matematica -->mat
	funcao inicio()
	{
		real num1, num2, num3, num4, raiz_quadrada

		escreva("Digite o primeiro numero: ")
		leia(num1)
		escreva("Digite o segundo numero: ")
		leia(num2)
		escreva("Digite o terceiro numero: ")
		leia(num3)
		escreva("Digite o quarto numero: ")
		leia(num4)

		num1 = (num1 * num1)
		num2 = (num2 * num2)
		num3 = (num3 * num3)
		num4 = (num4 * num4)

		se (num3>=1000)
		{
			escreva("\nValor do num3 é: ",num3)
		}
		senao
		{
			escreva("\nValor do num1: ",num1)
			escreva("\nValor do num2: ",num2)
			escreva("\nValor do num3: ",num3)
			escreva("\nValor do num4: ",num4)
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 477; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */