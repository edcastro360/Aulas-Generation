programa
{
	inclua biblioteca Matematica -->mat
	funcao inicio()
	{
		real PesoTomate,Excesso,Multa, Permitido=50

		escreva("Digite aqui quantos Kg's de tomate você tem: ")
		leia(PesoTomate)

		Excesso = PesoTomate - Permitido
		Multa = (4.00 * Excesso)

		se(PesoTomate <= 50)
		{
			escreva("\nMulta = ", 0)
		}
		senao se(PesoTomate > 50)
		{
			escreva("\nValor de multa a pagar R$: ",mat.arredondar(Multa, 2))
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 425; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */