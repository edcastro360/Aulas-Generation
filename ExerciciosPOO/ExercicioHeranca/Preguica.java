package ExercicioHeranca;

public class Preguica extends Animal { // SUBCLASS
	
	
	// ATRIBUTO
	private boolean subir;
	
	
	// CONSTRUTOR
	public Preguica (String nome, int idade, String som, boolean subir)
	{
		super (nome, idade, som);
		this.subir = subir;
	}
	

	// MÉTODO
	public boolean isSubir() {
		return subir;
	}


	public void setSubir(boolean subir) {
		this.subir = subir;
	}

}
