package Polimorfismo;

public abstract class Telefone { // CLASSE
	
	
	// ATRIBUTOS
	private String atrTipo;
		
	
	// CONSTRUTOR
	public Telefone(String parTipo)
	{
		this.atrTipo = parTipo;
	}
	
	
	// MÉTODOS ABSTRATO
	abstract public void disca(String paraNumero);
	
	abstract public void toca(int parNumToques);

	
	// MÉTODOS NÃO ABSTRATOS
	public String getAtrTipo() {
		return atrTipo;
	}


	public void setAtrTipo(String atrTipo) {
		this.atrTipo = atrTipo;
	}
	
		
}
