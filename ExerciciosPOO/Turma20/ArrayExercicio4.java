/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.*/

package Turma20;

import java.util.Scanner;

public class ArrayExercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float[][] matriz1 = new float [2][2];
		float[][] matriz2 = new float [2][2];
		float[][] matriz3 = new float [2][2];
		int constante, op;
		//final int cont=1; //Declaração de uma constante.
		
		Scanner leia = new Scanner(System.in);
		
		for(int l=0; l<2; l++)
		{
			for(int c=0; c<2; c++)
			{
				System.out.println("\nEntre com o valor da matriz1: ");
				matriz1[l][c] = leia.nextFloat();
				System.out.println("\nEntre com o valor da matriz2: ");
				matriz2[l][c] = leia.nextFloat();
				
			}
		}
		System.out.println("\nEntre com o valor da constante: ");
		constante = leia.nextInt();
		
		System.out.println("\n1- Somar as duas matrizes");
		System.out.println("\n2- Subtrair a primeira matrizes da segunda");
		System.out.println("\n3- Adicionar uma constante as duas matrizes");
		System.out.println("\n4- Imprimir as matrizes");
		System.out.println("\n5- Sair");
		System.out.println("\nQual opção deseja executar: ");
		op = leia.nextInt();
		
		while(op <1 || op>5)
		{
			System.out.println("\n1- Somar as duas matrizes");
			System.out.println("\n2- Subtrair a primeira matrizes da segunda");
			System.out.println("\n3- Adicionar uma constante as duas matrizes");
			System.out.println("\n4- Imprimir as matrizes");
			System.out.println("\n5- Sair");
			System.out.println("\nOpção inválida! Qual opção deseja executar: ");
			op = leia.nextInt();
		}
		if(op!=5)
		{
			
		//while(op!=5)
		//{
			switch(op)
			{
			case 1:
				for(int l=0; l<2; l++)
				{
					for(int c=0; c<2; c++)
					{
						matriz3[l][c] = matriz1[l][c] + matriz2[l][c];
						System.out.println("\nSOmatório: " + matriz3[l][c]);
					}
				}
				break;
			case 2:
				for(int l=0; l<2; l++)
				{
					for(int c=0; c<2; c++)
					{
						matriz3[l][c] = matriz2[l][c] - matriz1[l][c];
						System.out.println("\nDiferença " + matriz3[l][c]);
					}
				
				}
				break;
			case 3:
				for(int l=0; l<2; l++)
				{
					for(int c=0; c<2; c++)
					{
						matriz1[l][c] = matriz1[l][c] + constante;
						matriz2[l][c] = matriz2[l][c] + constante;

						System.out.println("\nMatriz1: " + matriz1[l][c] + "\t\tMatriz2: "+ matriz2[l][c]);
					}
				
				}
				break;
			case 4:
				for(int l=0; l<2; l++)
				{
					for(int c=0; c<2; c++)
					{
						System.out.println("\nMatriz1: " + matriz1[l][c] + "\t\tMatriz2: "+ matriz2[l][c]);

					}
				
				}
				break;
			//default:
				//System.out.println("\nOpção inválida! Tchau tchau :)");
				
			}
		}
		else
		{
			System.out.println("\nTchau tchau :)");

		}
	}
}


