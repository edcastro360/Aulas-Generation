programa
{
	
	funcao inicio()
	{
		inteiro matriz [3][3], soma=0, somaDiagonal=0, l, c, cont=0
		

		para(l = 0; l < 3; l++)
		{
			para(c = 0; c < 3; c++)
			{
				escreva("\nEntre com um valor: ")
				leia(matriz[l][c])
				soma = soma + matriz[l][c] 
				cont++

				se(c == l)
				{
					somaDiagonal += matriz[l][c]
				}
				
			}
		}
		escreva("\nA soma total dos valores é: ", soma)
		escreva("\nA soma total dos valores é: ", somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 312; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 6, 10, 6}-{soma, 6, 25, 4}-{somaDiagonal, 6, 33, 12}-{cont, 6, 55, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */