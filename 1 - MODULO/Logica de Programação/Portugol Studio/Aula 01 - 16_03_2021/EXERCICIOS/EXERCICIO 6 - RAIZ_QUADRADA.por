programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		real x2,x1,y2,y1,d,resultado

		escreva("Digite o primeiro numero: ")
		leia(x2)
		escreva("Digite o segundo numero: ")
		leia(x1)
		escreva("Digite o terceiro numero: ")
		leia(y2)
		escreva("Digite o terceiro numero: ")
		leia(y1)

		d = mat.raiz(mat.potencia(x2 - x1, 2)) + (mat.potencia(y2 - y1,2))
		
		resultado = (d)

		escreva(resultado)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 320; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */