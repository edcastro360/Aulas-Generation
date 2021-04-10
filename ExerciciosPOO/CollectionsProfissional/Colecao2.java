package CollectionsProfissional;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecao2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int op;
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do
		{
			System.out.println("\n\t\tDígite uma opção: ");
			System.out.println("--------------------------------------------");
			System.out.println("\n(1) Deseja adicionar produtos ao estoque? ");
			System.out.println("\n(2) Deseja remover produtos do estoque? ");
			System.out.println("\n(3) Deseja atualizar produtos no estoque? ");
			System.out.println("\n(4) Monstrar todos os produtos do estoque ");
			System.out.println("\n(0) Encerrar o programa ");
			
			System.out.println("--------------------------------------------");

			op = ler.nextInt();
			
			switch(op)
			{
			case 1:
				ler.nextLine();
				System.out.println("\nDígite o produto para adicionar ao estoque: ");
				String produto = ler.nextLine();
				estoque.add(produto);
				break;
			
			case 2:
				ler.nextLine();
				System.out.println("\nDígite o produto para remover do estoque: ");
				String produtor = ler.nextLine();
				
				if(estoque.contains(produtor))
				{
					estoque.remove(produtor);
				}
				else
				{
					System.out.println("\nO produto não existe!");
				}
				break;
				
			case 3:
				ler.nextLine();
				System.out.println("\nDígite o produto que quer atualizar: ");
				String verifica = ler.nextLine();
				System.out.println("\nDígite o nome do produto que entrará no lugar deste produto: " + verifica);
				String novo = ler.nextLine();
		
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nO produto não existe!");
				}
				break;
			case 4:
				System.out.println("\nOs produtos do estoque: ");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nPrograma finalizando!");
				
			}
			
		}while(op != 0);
		
			
	}

}
