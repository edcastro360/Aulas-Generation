package Heranca2;

public class Coordenador extends Pessoa { // SUBCLASS
	
	
	// ATRIBUTO
	private String CursoCoordenado;
	
	
	// CONSTRUTOR
	public Coordenador(String nome, int matricula, String cursoCoordenado)
	{
		super(nome, matricula);
		this.CursoCoordenado = cursoCoordenado;
	}

	
	// MÉTODO
	public String getCursoCoordenado() {
		return CursoCoordenado;
	}


	public void setCursoCoordenado(String cursoCoordenado) {
		CursoCoordenado = cursoCoordenado;
	}
	
}
