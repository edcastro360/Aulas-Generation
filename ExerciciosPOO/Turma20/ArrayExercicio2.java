/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.*/

package Turma20;

import java.util.Scanner;

public class ArrayExercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int [] numeros = new int [6];
		int somaPar=0, contImpar=0;
				
		Scanner leia = new Scanner(System.in);
		
		for (int i=0; i<6; i++)
		{
			System.out.println("Entre com um numero: ");
			numeros[i] = leia.nextInt();	
			
			if(numeros[i]%2==0)
			{
				somaPar = somaPar + numeros[i];
			}
			else
			{
				contImpar++;
			}
		}
		
		for(int i=0; i<6; i++)
		{
			if(numeros[i]%2==0)
			{
				System.out.println(numeros[i]+" <-- É um número par!");
			}
			else
			{
				System.out.println(numeros[i]+" <-- É um número ímpar!");

			}
		}
		System.out.println("\nA soma dos números pares: "+ somaPar);	
		System.out.println("\nA qauntidade de números ímpares: "+ contImpar);	

	}
}

