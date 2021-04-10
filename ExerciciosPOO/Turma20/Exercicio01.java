package Turma20;

// 1-	Faça um programa que receba três inteiros e diga qual deles é o maior.

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int num1, num2, num3, maior, menor;
		
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		num1 = input.nextInt();
		
		System.out.println("\nDigite o segundo número: ");
		num2 = input.nextInt();
		
		System.out.println("\nDigite o terceiro número: ");
		num3 = input.nextInt();
		
        maior = Math.max(num2,Math.max(num3,num1));
        //menor = Math.min(num2,Math.min(num3,num1));

        System.out.println("\nO maior valor é o número: " + maior);
			
	}
}