package Turma20;

import java.util.Scanner;

public class Repeticao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int idade;
		
		System.out.printf("\nEntre com a sua idade: ");
		idade = entrada.nextInt();
			
		do
		{
			
			System.out.printf("\nSua idade: %d", idade);
			if (idade >= 18)
			{
				System.out.printf("\nVocê é de maior: ");
			}
			else 
			{
				System.out.printf("\nVocê é de menor: ");
			}
			System.out.printf("\nEntre com a sua idade: ");
			idade = entrada.nextInt();			 
		}
		while (idade >= 1);


	}

}
