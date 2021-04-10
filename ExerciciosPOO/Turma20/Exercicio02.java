package Turma20;

import java.util.Scanner;

public class Exercicio02 {
	
// 2-	Faça um programa que entre com três números e coloque em ordem crescente.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int num1, num2, num3;
		  
		  Scanner leia = new Scanner(System.in);
		  
		  System.out.println("Programa que ordena números \n");
		  System.out.println("Digite o primeiro número: ");
		  num1 = leia.nextInt();
		  System.out.println("Digite o segundo número: ");
		  num2 = leia.nextInt();
		  System.out.println("Digite o terceiro número: ");
		  num3 = leia.nextInt();

		if(num1 < num2 && num2 < num3)
		  System.out.printf("%f %f %f", num1, num2, num3);
		else if(num1 == num2 && num2 < num3)
			System.out.printf("%f %f %f", num1, num2, num3);
		else if(num3 < num2 && num2 == num3)
			System.out.printf("%f %f %f", num1, num2, num3);
		else if(num1 == num3 && num3 < num2)
		  System.out.printf("%f %f %f", num1, num3, num2);
		else if(num1 < num3 && num3 < num2)
			System.out.printf("%f %f %f", num1, num3, num2);
		else if(num2 < num1 && num1 < num3)
		  System.out.printf("%f %f %f", num2, num1, num3);
		else if(num2 < num3 && num3 < num1)
		  System.out.printf("%f %f %f", num2, num3, num1);
		else if(num3 < num1 && num1< num2)
		  System.out.printf("%f %f %f", num3, num1, num2);
		else
		  System.out.printf("%f %f %f",num3, num2, num1);

		
	}

}
