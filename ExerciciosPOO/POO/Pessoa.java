package POO;

public class Pessoa { // Classe!
	
	// Atributos!
	private String primeiroNome;
	private String ultimoNome;
	private String nomesDoMeio;

	// Construtor! Com o mesmo nome da Classe!
	public Pessoa (String primeiro, String meio, String ultimo)
	{
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		nomesDoMeio = meio;
	}
	
	// Método!
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome+" "+ nomesDoMeio+" "+ ultimoNome;
		return nomeCompleto;
	}

}
