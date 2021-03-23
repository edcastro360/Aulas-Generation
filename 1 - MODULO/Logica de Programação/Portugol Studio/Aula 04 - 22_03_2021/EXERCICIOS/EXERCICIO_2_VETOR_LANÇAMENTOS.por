programa
{

/*2.	Um dado é lançado 10 vezes e o valor correspondente é anotado. 
Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
A seguir determine e imprima a média aritmética dos lançamentos, 
contabilize e apresente também quantas foram as ocorrências da maior pontuação.*/
	
	funcao inicio()
	{
		inteiro lancamento[10], soma=0, x, contMaior=0, maiorValor=0, cont=0
		real media

		para(x = 0;  x < 10; x++)
		{
			escreva("Dígite o lançamento: ")
			leia(lancamento[x])
			enquanto(lancamento[x]<1 ou lancamento[x]>6)
			{
				escreva("\nDígite novamento o lançamento: ")
				leia(lancamento[x])
			}

			soma = soma + lancamento[x]

			/*se(maiorValor<lancamento[x])
			{
				maiorValor = lancamento[x]
			}*/
			se(lancamento[x] == 6)
			{
				contMaior++ // contMaior = contMaio + 1
			}
		}
		para(x = 0; x < 10; x++)
		{
			escreva("\nLançamento ",x+1,": ",lancamento[x])
			/*se(maiorValor == lancamento[x])
			{
				cont++
			}*/
		}
		media = soma / 10
		escreva("\nMédia de lançamentos: ",media)
		escreva("\nQuantidade de vezes que apareceu o maior valor: ",contMaior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1116; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {lancamento, 11, 10, 10}-{soma, 11, 26, 4}-{contMaior, 11, 37, 9}-{media, 12, 7, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */