programa
{
	inclua biblioteca Matematica -->mat
	funcao inicio()
	{
		real custoFabrica,cc

		escreva("\n Entre com o custo de fabrica: ")
		leia(custoFabrica)

		cc = custoFabrica + (custoFabrica*0.73) // 0.28 porcentagem distribuidor e 0.45 impostos

		escreva("Custo ao consumidor: R$ ",mat.arredondar(cc,2))	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */