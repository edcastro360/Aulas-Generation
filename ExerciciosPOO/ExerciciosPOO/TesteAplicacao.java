package ExerciciosPOO;

import java.util.Scanner;

public class TesteAplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("-------Teste da Classe Cliente--------");
		
		
		Exercicio1Cliente cliente1 = new Exercicio1Cliente ("Matheus Silva","111.111.111-11","Masculino","teste@teste.com.br","(11)9 9999-9999");
		
		cliente1.comprarProduto(); // 1
		cliente1.devolverProduto(); // 0
		cliente1.comprarProduto(); // 1
		cliente1.printInfo();
		
		
		System.out.println("\n----- Teste da Classe Funcionário------");
		leia.nextLine();
	
		System.out.println("\nDígite o nome do funcionário: ");
		String nome = leia.nextLine();
		System.out.println("\nDígite o CPF do funcionário: ");
		String cpf = leia.nextLine();
		System.out.println("\nDígite o RG do funcionário: ");
		String rg = leia.nextLine();
		System.out.println("\nDígite o genero do funcionário: ");
		String genero = leia.nextLine();
		System.out.println("\nDígite o e-mail do funcionário: ");
		String email = leia.nextLine();
		System.out.println("\nDígite a data de nascimento do funcionário: ");
		String data_nasc = leia.nextLine();
		System.out.println("\nDígite a matrícula do funcionário: ");
		String matricula = leia.nextLine();
		System.out.println("\nDígite o cargo do funcionário: ");
		String cargo = leia.nextLine();
		System.out.println("\nDígite o salário do funcionário: ");
		double salario = leia.nextDouble();

		Exercicio4Funcionario funcionario1 = new Exercicio4Funcionario(nome, cpf, rg, genero, email, data_nasc, matricula, cargo, salario);
		
		funcionario1.imprimirInfo();
		
		funcionario1.setCargo("Desenvolvedor Java Pleno");
		
		funcionario1.aumentarSalario(20);
		
		funcionario1.imprimirInfo();
		
		
		System.out.println("\n----- Teste da Classe Avião------");
		String nomeAviao, modelo, destino, companhia;
		int total_passageiros=0;
		double peso;
		boolean status = false;
		
		Exercicio2Aviao1[] avioes = new Exercicio2Aviao1[3];
		
		for(int i=0; i<3; i++)
		{
			leia.nextLine();
			System.out.println("\nDígite o nome do avião: ");
			nomeAviao = leia.nextLine();
			System.out.println("\nDígite o modelo do avião: ");
			modelo = leia.nextLine();
			System.out.println("\nDígite o destino do avião: ");
			destino = leia.nextLine();
			System.out.println("\nDígite o nome da companhia aérea: ");
			companhia = leia.nextLine();
			System.out.println("\nDígite o total de passageiros do avião: ");
			total_passageiros = leia.nextInt();
			System.out.println("\nDígite o peso do avião: ");
			peso = leia.nextDouble();
			
			avioes[i] = new Exercicio2Aviao1(nomeAviao, modelo, destino, companhia, total_passageiros, peso, status);
			
			System.out.println("----------------------------------------------------------------------------------");
					
		}
		
		System.out.println("\nBanco de dados de aviões\n");
		
		for(Exercicio2Aviao1 x: avioes)
		{
			x.imprimirInfo();
		}
		
		avioes[0].statusVoando();
		avioes[1].statusVoando();
		//avioes[2].getNomeAviao();
		
		
		System.out.println("\nBanco de dados de aviões\n");
		
		for(Exercicio2Aviao1 x: avioes)
		{
			x.imprimirInfo();
		}
		

	}

}
