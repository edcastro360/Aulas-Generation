package Turma20;

//4-	Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
//      Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numero;
		//resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero inteiro: ");
		numero = leia.nextInt();
		
		if (numero % 2 == 0 && numero >= 0)
		{
			System.out.printf("\nO n�mero digitado: %2.0f � par!",numero);
					//A raiz quadrada do n�mero �: %f ", numero);
					//= Math.sqrt(numero),;
		}
		else if (numero % 1 == 0 && numero >= 0)
		{
			System.out.printf("\nO n�mero digitado: %2.0f � impar! ",numero); 
		//"O n�mero elevado ao quadrado �: " ,numero, numero = Math.pow(numero, 2);
		}

		else
		{
			System.out.println("\nO n�mero digitado: " + numero + " � inv�lido!");
		}
	}
}
