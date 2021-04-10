package ExercicioPolimorfismo;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String nome, idade;
		int n;
		
		Scanner leia = new Scanner (System.in);
		
		do {
			System.out.println("********************************************************************************************************************************************************************************************************* ");
			System.out.println("********************************************************************************************************************************************************************************************************* ");
			System.out.println("********************************************************************************************************************************************************************************************************* ");
		System.out.println("Qual animal você deseja cadastrar?\n1--> Cachorro\n2--> Cavalo\n3--> Preguica\n4--> Sair \n************************************************************************************************************************************************************************** ");
		System.out.println("************************************************************************************************************************************************************************************************************* ");
		System.out.println("************************************************************************************************************************************************************************************************************* ");
		System.out.println("************************************************************************************************************************************************************************************************************* ");

		
		n = leia.nextInt();
		
		
		
			leia.nextLine();
			switch (n)
			{
			
			case (1):
				System.out.println("Qual o nome do seu cachorro? ");
				String nome = leia.nextLine();
				System.out.println("Qual a idade do seu cachorro? ");
				String idade = leia.nextLine();
				System.out.println("Qual a raça do seu cachorro? ");
				String raca = leia.nextLine();
				cachorro novocachorro = new cachorro(nome,idade,"cachorro",raca);
				System.out.println("\n**************************************************************************************************************************\n ");
				novocachorro.ImprimirInfo();
				System.out.println("\n**************************************************************************************************************************\n ");
				
				System.out.println("Gostaria de mudar o estado da ação?\n-->1 Começar a correr\n-->2 Não correr\n");
				int correr = leia.nextInt();
				novocachorro.Acao(correr);
				System.out.println("Gostaria de mudar o estado do comportamento 'emitir som' do animal?\n-->1 Emitir Som \n-->2 Não emitir som\n");
				int som = leia.nextInt();
				novocachorro.Som(som);
				System.out.println("\n****************************************************************************************************************************\n ");
				novocachorro.ImprimirInfo();
			
				break;
				
			case (2):
				System.out.println("Qual o nome do seu cavalo? ");
				nome = leia.nextLine();
				System.out.println("Qual a idade do seu cavalo? ");
				idade = leia.nextLine();
				System.out.println("Digite a categoria do seu cavalo: ");
				String categoria = leia.nextLine();
				cavalo novoCavalo = new cavalo (nome,idade,"cavalo",categoria);
				System.out.println("\n*******************************************************************************************************************************\n ");
				novoCavalo.ImprimirInfo();
				System.out.println("\n*******************************************************************************************************************************\n ");
				
				System.out.println("Gostaria de mudar o estado de ação do animal?\n-->1 Começar a correr\n-->2 Não correr\n");
				correr = leia.nextInt();
				novoCavalo.Acao(correr);
				System.out.println("Gostaria de mudar o estado do comportamento 'emitir som' do animal?\n-->1 Emitir som\n-->2 Não emitir som\n");
				som = leia.nextInt();
				novoCavalo.Som(som);
				System.out.println("\n*******************************************************************************************************************************\n ");
				novoCavalo.ImprimirInfo();
				
				break;
				
			case (3):
				System.out.println("Qual o nome da sua preguiça? ");
				nome = leia.nextLine();
				System.out.println("Qual a idade da sua preguica? ");
				idade = leia.nextLine();				
				System.out.println("Qual a origem do seu bicho preguiça? "); //Brasil? América do Sul? Ásia?");
				String origem = leia.nextLine();
				preguica novaPreguica = new preguica(nome,idade,"preguica", origem);
				System.out.println("\n*************************************************************************************************************************\n ");
				novaPreguica.ImprimirInfo();
				System.out.println("\n**************************************************************************************************************************\n ");
				
				System.out.println("Gostaria de mudar o estado de ação do animal?\n-->1 Subindo em árvores\n-->2 Não está subindo em árvores\n");
				correr = leia.nextInt();
				novaPreguica.Acao(correr);
				System.out.println("Gostaria de mudar o estado do comportamento 'emitir som' do animal?\n-->1 Emitir som\n-->2 Não emitir som\n");
				som = leia.nextInt();
				novaPreguica.Som(som);
				System.out.println("\n**************************************************************************************************************************\n ");
				novaPreguica.ImprimirInfo();
				break;
				
			}
		
		
		
		 }while (n != 4);
		

		
	}

}