package Turma20;

import java.text.NumberFormat;

public class Empregado {
	
	// Declaração dos atributos da classe
	
	private String nome;
	private double salario;
	
	// Metodo construtor
	
	public Empregado(String n, double s)
	{
		this.setNome(n);
		this.setSalario(s);
	}
	
	public void setNome(String n)
	{
		nome=n;
	}
	
	public void setSalario(double sal)
	{
		salario=sal;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}
	
	public void aumentarSalario(double percentual)
	{
		salario *= 1 + percentual/100;  //salario *=      salario = salario *		
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
	public void imprimirInfo()
	{
		System.out.println(nome+"  "+"Salário: "+this.formatarMoeda());
	}

}
