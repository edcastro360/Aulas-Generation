programa
{
	
	funcao inicio()
	{
		real num,contNum=0,somaNum=0
		real mediaNum
		cadeia palavra = "Sair"

		escreva("Entre com um número e Zero para parar: ")
		leia(num)

		enquanto(num!=0)
		//enquanto(palavra!="Sair")
		{
			contNum++ // contNum = contNum + 1
			somaNum = somaNum + num

			escreva("\nEntre com um número e Zero para parar: ")
			leia(num)//8
			/*para(inteiro x=1;x<=3;x++)
			{
			escreva("\n,x")
			}
			se(contNum<3)
			{
				escreva("\nParabéns, você conseguiu colocar um laço condicional dentro do enquanto") 
			}*/
		}
		se(contNum==0)
		{
			escreva("Não posso fazer essa conta!")
		}
		senao
		{
		mediaNum = somaNum / contNum
		escreva("A média dos números digitados foi de: ",mediaNum)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 311; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */