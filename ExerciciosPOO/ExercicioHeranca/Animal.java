package ExercicioHeranca;

public class Animal { // CLASSE
	
	
	// ATRIBUTO
	private String nome;
	private int idade;
	private String som;
	
	
	
	// CONSTRUTOR
	public Animal (String nome, int idade, String som)
	{
		this.nome = nome;
		this.idade = idade;
		this.som = som;
	}
	

	// MÉTODO
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getSom() {
		return som;
	}


	public void setSom(String som) {
		this.som = som;
	}
		


}
