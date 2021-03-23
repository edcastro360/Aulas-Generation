programa
{
/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
* coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.*/  
	
	inclua biblioteca Matematica -->mat
	funcao inicio()
	{
		cadeia nome
		inteiro filhos, mediaFilhos=0,x
		real salario,mediaSal=0,maiorSal=0,porc=0
	

		para(x=1;x<=20;x++)
		{
			limpa()
			escreva("\nEntre com o nome do trabalhador: ")
			leia(nome)
							
			escreva("Entre com o salário do trabalhador: ")
			leia(salario)
			
			escreva("\nEntre com a quantidade de filhos: ")
			leia(filhos)
			
			mediaSal+=salario
			mediaFilhos+=filhos

			se(maiorSal<salario)
			{
				maiorSal=salario
			}

			se(salario<=100)
			{
				porc++
			}
						
		}
		mediaSal=mediaSal/20
		mediaFilhos=mediaFilhos/20
		porc=(porc/20)*100

		escreva("\nA média de salários é: ",mediaSal)
		escreva("\nA média do número de filhos é: ",mediaFilhos)
		escreva("\nO maior salário é: ",maiorSal)
		escreva("\nO percentual de pessoas com salário até R$100,00 é: ",porc, " %")  
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 90; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */