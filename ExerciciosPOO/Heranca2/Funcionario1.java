package Heranca2;

public class Funcionario1 extends Pessoa { //SUBCLASS
	
	
	// ATRIBUTO
	private String departamento;
	
	public Funcionario1(String nome, int matricula, String departamento)
	{
		super(nome, matricula);
		this.departamento = departamento;
	}
	
	
	// M�TODO
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
