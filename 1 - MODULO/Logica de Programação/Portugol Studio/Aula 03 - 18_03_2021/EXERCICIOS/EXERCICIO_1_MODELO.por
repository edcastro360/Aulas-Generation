programa
{
//1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. 
//A prefeitura deseja saber:   
//a) média do salário da população; 
//b) média do número de filhos; 
//c) maior salário; 
//d) percentual de pessoas com salário até R$100,00.  

	
	funcao inicio()
	{
		real sal, somaSal=0.0, mediaSal, mediaNF, maiorSal=0.0,porc
		inteiro NF, somaNF=0, cont100=0,x

		para(x=1; x<=4; x++)
		{
			escreva("Valor do salário: ")
			leia(sal)
			escreva("Quantidade de filhos: ")
			leia(NF)

			somaSal = somaSal + sal
			somaNF = somaNF + NF

			se(maiorSal<sal)
			{
				maiorSal = sal
			}
			se(sal<=100)
			{
				cont100++
			}
		}

		mediaSal = somaSal / 4
		mediaNF = somaNF / 4
		porc = (cont100 * 100) / 4

		escreva("\nMédia salárial: ",mediaSal)
		escreva("\nMédia de filhos: ",mediaNF)
		escreva("\nMaior salário: ",maiorSal)
		escreva("\nPorcentagem de pessoas com salário de até 100 reais: ",porc," %")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 991; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */