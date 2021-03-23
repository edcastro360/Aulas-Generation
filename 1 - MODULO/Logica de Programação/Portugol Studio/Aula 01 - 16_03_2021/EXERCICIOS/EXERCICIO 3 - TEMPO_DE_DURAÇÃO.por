programa
{
	
	funcao inicio()
	{
		
		inteiro ts, hora, minutos, segundos

		escreva("\nEntre com o total de tempo: ")
		leia(ts)							

		hora = ts / 3600		
		minutos = (ts % 3600) / 60
		segundos = (ts % 3600) % 60
		escreva("\nTempo expresso em: ",hora, " hora(s) e ",minutos, " minuto(s) e ",segundos, " segundo(s) de duração de um evento ")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 136; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */