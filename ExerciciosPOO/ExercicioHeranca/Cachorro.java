package ExercicioHeranca;

public class Cachorro extends Animal { //SUBCLASS
	
	
	// ATRIBUTO
	private boolean correr;
	
	
	// CONSTRUTOR
	public Cachorro (String nome, int idade, String som, boolean correr)
	{
		super(nome, idade, som);
		this.correr = correr;
	}
	

	// MÉTODO
	public boolean isCorrer() {
		return correr;
	}


	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	
}
