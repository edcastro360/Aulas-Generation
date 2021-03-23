programa
{
	
	funcao inicio()
	{
		inteiro anos, meses, dias, totalDias // Exercicio 1
		inteiro td, ano, mes, dia // Exercicio 2

		escreva("Escreva com os anos: ")
		leia(anos)
		escreva("Escreva com os meses: ")
		leia(meses)
		escreva("Escreva com os dias: ")
		leia(dias)
		totalDias = anos*365 + meses*30 + dias

		escreva("\nTotal de dias: ",totalDias)

		escreva("\nEntre com o total de dias: ") // Entre com o total de segundos
		leia(td)							// leia(ts)

		anos = td / 365		//hora = ts / 3600
		mes = (td % 365) / 30	//minutos = (ts % 3600)/60
		dia = (td % 365) / 30	//segundos = (ts % 3600) % 60
		escreva("\nEu tenho: ",ano, "ano(s) e ",mes, "mes(es) e ",dia, "dia(s) de vida")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 692; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */