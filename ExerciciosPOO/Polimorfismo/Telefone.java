package Polimorfismo;

public abstract class Telefone { // CLASSE
	
	
	// ATRIBUTOS
	private String atrTipo;
		
	
	// CONSTRUTOR
	public Telefone(String parTipo)
	{
		this.atrTipo = parTipo;
	}
	
	
	// M�TODOS ABSTRATO
	abstract public void disca(String paraNumero);
	
	abstract public void toca(int parNumToques);

	
	// M�TODOS N�O ABSTRATOS
	public String getAtrTipo() {
		return atrTipo;
	}


	public void setAtrTipo(String atrTipo) {
		this.atrTipo = atrTipo;
	}
	
		
}
