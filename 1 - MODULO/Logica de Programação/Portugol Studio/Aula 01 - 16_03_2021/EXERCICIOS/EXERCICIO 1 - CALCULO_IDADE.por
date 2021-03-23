programa
{
	
	funcao inicio()
	{
		inteiro idade, meses, dias
		cadeia nome

		escreva("\nQual é o seu nome: ")
		leia(nome)
		escreva("\nQual é a sua idade: ")
		leia(idade)

		escreva("Olá, meu nome é ", nome, " e tenho ", idade, " anos")

		meses = idade * 12
		dias = idade * 365

		escreva("\nEle tem ", idade, " anos de vida")
		escreva("\nEle tem ", meses, " meses de vida")
		escreva("\nEle tem ", dias, " dias de vida")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 431; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */