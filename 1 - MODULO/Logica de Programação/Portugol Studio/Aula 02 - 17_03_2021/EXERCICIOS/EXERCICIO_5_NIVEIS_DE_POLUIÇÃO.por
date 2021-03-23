programa
{
	
	funcao inicio()
	{
		real indicePoluicao

		escreva("Digite o índice de poluição: ")
		leia(indicePoluicao)
				

		se(indicePoluicao >= 0.05 e indicePoluicao <= 0.25)
		{
			escreva("\nÍndice aceitável")
		}
		senao se(indicePoluicao > 0.25 e indicePoluicao < 0.3)
		{
			escreva("\nProximo do 1º grupo terem de suspender suas atividades!")
		}
		senao se(indicePoluicao >= 0.3 e indicePoluicao < 0.4)
		{
			escreva("\n1º grupo são intimadas a suspenderem suas atividades")
		}
		senao se(indicePoluicao >= 0.4 e indicePoluicao < 0.5)
		{
			escreva("\n1º e 2º grupo são intimadas a suspenderem suas atividades")
		}
		senao
		{
			escreva("\nTodos os grupos devem ser notificados a paralisarem suas atividades")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 9; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */