package Heranca2;

public class TestePessoa {
	
	public static void main (String args[])
	{
		Pessoa jessica = new Pessoa("Jessica", 555);
		Funcionario1 pedro = new Funcionario1 ("Pedro", 222, "TI");
		Pessoa maria = new Funcionario1("Maria", 333, "Inform�tica--Desenvolvimento");
		Pessoa jose = new Coordenador("Jos�", 444, "Ci�ncia da Computa��o");
		System.out.println(jessica.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getNome());
	
	}

}
