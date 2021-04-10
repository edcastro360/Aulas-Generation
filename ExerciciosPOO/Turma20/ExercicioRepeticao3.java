package Turma20;

import java.util.Scanner;

public class ExercicioRepeticao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade,cont21=0,cont50=0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com a idade: ");
		idade = leia.nextInt();//10 67 -88 -8
		while(idade<1 || idade>120)
		{
			System.out.println("\nEntre com uma nova idade: ");
			idade = leia.nextInt();
		}
		while(idade!=-99)
		{
			if(idade<21)
			{
				cont21++;
			}
			if(idade>50)
			{
				cont50++;
			}
			 
			System.out.println("\nEntre com a idade: ");
			idade = leia.nextInt();
			/*while(idade<1 || idade>120)
			{
				System.out.println("\nEntre com uma nova idade: ");
				idade = leia.nextInt();
			}*/
		}
		System.out.println("\nTemos: "+cont21+" pessoas com menos de 21 anos...");
		System.out.println("\nTemos: "+cont50+" pessoas com mais de 50 anos");
	}

}


