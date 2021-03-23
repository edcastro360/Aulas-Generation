programa
{
	
	funcao inicio()
	{
		inteiro vetLeitura[5], soma=0, x, maiorPontuacao=0, cont=0
		
		para(x = 0; x < 5; x++)
		{
			escreva("Entre com um valor: ")
			leia(vetLeitura[x])

			soma = soma + vetLeitura[x]
		}

		para(x = 0; x < 5; x++)
		{
			escreva("\nPosição ",x," vale: ",vetLeitura[x])

			se(maiorPontuacao < vetLeitura[x])
				{
					maiorPontuacao = vetLeitura[x]
				}
				cont++
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 284; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */