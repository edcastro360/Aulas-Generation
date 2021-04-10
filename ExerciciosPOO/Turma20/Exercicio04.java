package Turma20;

//4-	Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
//      Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numero;
		//resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro: ");
		numero = leia.nextInt();
		
		if (numero % 2 == 0 && numero >= 0)
		{
			System.out.printf("\nO número digitado: %2.0f é par!",numero);
					//A raiz quadrada do número é: %f ", numero);
					//= Math.sqrt(numero),;
		}
		else if (numero % 1 == 0 && numero >= 0)
		{
			System.out.printf("\nO número digitado: %2.0f é impar! ",numero); 
		//"O número elevado ao quadrado é: " ,numero, numero = Math.pow(numero, 2);
		}

		else
		{
			System.out.println("\nO número digitado: " + numero + " é inválido!");
		}
	}
}
