package CestaBasica;

import java.util.Scanner; 

public class CestaBasica
{

	public static void main(String args[])
	{
		CestaBasica cesta[];
		cesta = new CestaBasica[10];
		for (int i = 0; i<10; i++)
		{
			cesta[i] = new CestaBasica();
		}
		
		Scanner input = new Scanner(System.in);
		int i, v, opc;
		int produto[] = new int[10];


do 
{

	// TELA INICIAL DE BOAS VINDAS
System.out.println("\n******************************************************************************************************************************************");
System.out.println("******************************************************************************************************************************************");
System.out.println("****************************************************--------------BRASIL SEM FOME-------------***********************************************");
System.out.println("******************************************************************************************************************************************");
System.out.println("******************************************************************************************************************************************");
System.out.println("******************************************************************************************************************************************");
System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("");
System.out.println("");
System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("1- CESTA BASICA");
System.out.println("2- ITENS ESSENCIAIS");
System.out.println("3- ITENS DE HIGIENE");
System.out.println("4- DINHEIRO EM ESPÉCIE");
System.out.println("\n******************************************************************************************************************************************");
System.out.println("5- DISTRIBUIR UM PRODUTO");
System.out.println("6- DISTRIBUIR TODOS OS PRODUTOS");
System.out.println("7- RELATÓRIO DE ESTOQUE");
System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("8- Sair");
System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("");
System.out.println("Escolha a operacao desejada:");
opc = input.nextInt();


	switch(opc)
	{

	case 1: 
		System.out.println("Escolha a forma de doação desejada: ");
		i = input.nextInt();
		if (i <10){

			if (produto[i]== 0) 
			{

				System.out.printf("Produto recebido com sucesso: Produto número %d", i); 
				produto[i]= 1; 

			}
			else
			{
				System.out.println("\nProduto em estoque!"); 
			}
		 	}
			else
			{
				System.out.println("Produto Inexistente");
			}
	
		
		break;
		
	case 2: 
		System.out.println("Escolha a forma de doação desejada: ");
		i = input.nextInt();
		if (i <10){

			if (produto[i]== 0) 
			{

				System.out.printf("Produto recebido com sucesso: Produto número %d", i); 
				produto[i]= 1; 

			}
			else
			{
				System.out.println("\nProduto em estoque!"); 
			}
		 	}
			else
			{
				System.out.println("Produto Inexistente");
			}
	
		
		break;
		
	case 3: 
		System.out.println("Escolha a forma de doação desejada: ");
		i = input.nextInt();
		if (i <10){

			if (produto[i]== 0) 
			{

				System.out.printf("Produto recebido com sucesso: Produto número %d", i); 
				produto[i]= 1; 

			}
			else
			{
				System.out.println("\nProduto em estoque!"); 
			}
		 	}
			else
			{
				System.out.println("Produto Inexistente");
			}
	
		
		break;
		
	case 4: 
		System.out.println("Escolha a forma de doação desejada: ");
		i = input.nextInt();
		if (i <10){

			if (produto[i]== 0) 
			{

				System.out.printf("Produto recebido com sucesso: Produto número %d", i); 
				produto[i]= 1; 

			}
			else
			{
				System.out.println("\nProduto em estoque!"); 
			}
		 	}
			else
			{
				System.out.println("Produto Inexistente");
			}
	
		
		break;
		
		case 5:
			System.out.println("Escolha o produto"); 
			i = input.nextInt();
			if (produto[i]== 0)
			{
				System.out.printf("O produtoo %d encontra-se vazio no momento!", i); 

			}
			else 
			{
				System.out.println("Produto doado com sucesso!"); 
				produto[i]= 0; 
			}
			break;
			
			case 6:
				System.out.println("Todos os produtos foram doados com sucesso"); 
				for(v=0; v<10; v++)
				{
					produto[v]= 0; 
				}
				break;
				
			case 7:
				System.out.println("\nListagem de produtos!"); 
				for (i=0; i<produto.length; i++)
				{
					if (produto[i]==0) 
					{
						System.out.printf("\nArroz: %d: ---- vazio", i);
					}else
					{
						System.out.printf("\nArroz: %d: ---- em estoque", i); 
					}
				}
			/*case 5:
				System.out.println("Listagem de produtos!"); 
				for (i=0; i<produtos.length; i++)
				{
					if (produtos[i]==0) 
					{
						System.out.printf("\nProduto: %d: ----Disponível",i);
					}else
					{
						System.out.printf("\nProduto: %d: ----Indisponível",i); 
					}
				}
			case 6:
				System.out.println("Listagem de produtos!"); 
				for (i=0; i<produtos.length; i++)
				{
					if (produtos[i]==0) 
					{
						System.out.printf("\nProduto: %d: ----Disponível",i);
					}else
					{
						System.out.printf("\nProduto: %d: ----Indisponível",i); 
					}
				}*/
				break;

			default:
				System.out.println("Opcao invalida"); 

			}



			}while(opc!=8); 
			System.out.println("Programa finalizado"); 

			}


}