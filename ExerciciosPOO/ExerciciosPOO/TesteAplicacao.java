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
		
		
		System.out.println("\n----- Teste da Classe Funcion�rio------");
		leia.nextLine();
	
		System.out.println("\nD�gite o nome do funcion�rio: ");
		String nome = leia.nextLine();
		System.out.println("\nD�gite o CPF do funcion�rio: ");
		String cpf = leia.nextLine();
		System.out.println("\nD�gite o RG do funcion�rio: ");
		String rg = leia.nextLine();
		System.out.println("\nD�gite o genero do funcion�rio: ");
		String genero = leia.nextLine();
		System.out.println("\nD�gite o e-mail do funcion�rio: ");
		String email = leia.nextLine();
		System.out.println("\nD�gite a data de nascimento do funcion�rio: ");
		String data_nasc = leia.nextLine();
		System.out.println("\nD�gite a matr�cula do funcion�rio: ");
		String matricula = leia.nextLine();
		System.out.println("\nD�gite o cargo do funcion�rio: ");
		String cargo = leia.nextLine();
		System.out.println("\nD�gite o sal�rio do funcion�rio: ");
		double salario = leia.nextDouble();

		Exercicio4Funcionario funcionario1 = new Exercicio4Funcionario(nome, cpf, rg, genero, email, data_nasc, matricula, cargo, salario);
		
		funcionario1.imprimirInfo();
		
		funcionario1.setCargo("Desenvolvedor Java Pleno");
		
		funcionario1.aumentarSalario(20);
		
		funcionario1.imprimirInfo();
		
		
		System.out.println("\n----- Teste da Classe Avi�o------");
		String nomeAviao, modelo, destino, companhia;
		int total_passageiros=0;
		double peso;
		boolean status = false;
		
		Exercicio2Aviao1[] avioes = new Exercicio2Aviao1[3];
		
		for(int i=0; i<3; i++)
		{
			leia.nextLine();
			System.out.println("\nD�gite o nome do avi�o: ");
			nomeAviao = leia.nextLine();
			System.out.println("\nD�gite o modelo do avi�o: ");
			modelo = leia.nextLine();
			System.out.println("\nD�gite o destino do avi�o: ");
			destino = leia.nextLine();
			System.out.println("\nD�gite o nome da companhia a�rea: ");
			companhia = leia.nextLine();
			System.out.println("\nD�gite o total de passageiros do avi�o: ");
			total_passageiros = leia.nextInt();
			System.out.println("\nD�gite o peso do avi�o: ");
			peso = leia.nextDouble();
			
			avioes[i] = new Exercicio2Aviao1(nomeAviao, modelo, destino, companhia, total_passageiros, peso, status);
			
			System.out.println("----------------------------------------------------------------------------------");
					
		}
		
		System.out.println("\nBanco de dados de avi�es\n");
		
		for(Exercicio2Aviao1 x: avioes)
		{
			x.imprimirInfo();
		}
		
		avioes[0].statusVoando();
		avioes[1].statusVoando();
		//avioes[2].getNomeAviao();
		
		
		System.out.println("\nBanco de dados de avi�es\n");
		
		for(Exercicio2Aviao1 x: avioes)
		{
			x.imprimirInfo();
		}
		

	}

}
