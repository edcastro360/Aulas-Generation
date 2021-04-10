package Polimorfismo2;

public class TestePolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("Juliana da Silva Pereira");
		fisica.setCpf(12345678902L);
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("Cristiano Ronaldo7 ME");
		juridica.setCnpj(18241306000185L);
		
		Pessoa1[] pessoas = new Pessoa1[2];
		pessoas[0]=fisica;
		pessoas[1]=juridica;
		
		for (Pessoa1 pessoa:pessoas)
		{
			System.out.println(pessoa.getNome());
		}
		
	}

}
