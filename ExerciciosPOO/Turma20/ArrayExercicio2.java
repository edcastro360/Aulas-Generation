/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.*/

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
				System.out.println(numeros[i]+" <-- � um n�mero par!");
			}
			else
			{
				System.out.println(numeros[i]+" <-- � um n�mero �mpar!");

			}
		}
		System.out.println("\nA soma dos n�meros pares: "+ somaPar);	
		System.out.println("\nA qauntidade de n�meros �mpares: "+ contImpar);	

	}
}

