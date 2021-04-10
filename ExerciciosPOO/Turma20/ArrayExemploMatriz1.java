package Turma20;

import java.util.Scanner;

public class ArrayExemploMatriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] idade = new int[2][2];
		float media;
		int somaIdade=0, contIdade=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int l=0; l<2; l++)
		{
			for(int c=0; c<2; c++)
			{
				System.out.println("\nEntre com a sua idade: ");
				idade[l][c] = leia.nextInt();
				somaIdade = somaIdade + idade[l][c];
				contIdade++;
			}
		}
		media = somaIdade / contIdade;
		
		System.out.printf("\nA média de idades foi de: %3.2f",media);
	}

}
