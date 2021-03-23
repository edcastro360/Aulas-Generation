programa
{
	
	funcao inicio()
	{
		inteiro numero, resultado
		escreva("\nEntre com um número inteiro: ")
		leia(numero)

		resultado = numero % 2

		se(resultado == 0 e numero > 0)
		{
			escreva("\nO número digitado: ", numero, " é par e positivo")
		}
		senao se(resultado == 0 e numero < 0)
		{
			escreva("\nO número digitado: ", numero, " é par e negativo")
		}
		senao se(resultado != 0 e numero > 0)
		{
			escreva("\nO número digitado: ", numero, " é impar e positivo")
		}
		senao se(resultado != 0 e numero < 0)
		{
			escreva("\nO número digitado: ", numero, " é impar e negativo")
		}
		senao
		{
			escreva("\nO número digitado: ", numero, " é nulo, nem negativo nem positivo")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 661; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */