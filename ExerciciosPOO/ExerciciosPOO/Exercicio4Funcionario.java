package ExerciciosPOO;

import java.text.NumberFormat;

public class Exercicio4Funcionario { // CLASSE
	
	// ATRIBUTO
	private String nome;
	private String cpf;
	private String rg;
	private String genero;
	private String email;
	private String data_nasc;
	private String matricula;
	private String cargo;
	private double salario;
	
	// CONSTRUTOR
	public Exercicio4Funcionario(String nome, String cpf, String rg, String genero, String email, String data_nasc, String matricula, String cargo, double salario)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.genero = genero;
		this.email = email;
		this.data_nasc = data_nasc;
		this.matricula = matricula;
		this.cargo = cargo;
		this.salario = salario;
				
	}
	
	// MÉTODO
	public void aumentarSalario(double percentual)
	{
		salario *= 1 + percentual/100;  //salario *=      salario = salario *		
	}
	
	public String formatarSal()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
		
	}
	
	public void imprimirInfo()
	{
		System.out.println("****Informações do Funcionario*****\nNome"+nome+"\nCPF: "+cpf+ "\nRG:"+rg+"\nGenero: "+genero+"\ne-mail: "+email+"\nData de nascimento: "+data_nasc+"\nMatricula: "+matricula+"\nCargo: "+cargo+ "Salário: "+this.formatarSal());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
