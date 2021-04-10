package Turma20;

import java.util.Scanner;

public class Correcao02Decisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, num3;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com o número 1: ");
		num1 = leia.nextInt();
		System.out.println("Entre com o número 2: ");
		num2 = leia.nextInt();
		System.out.println("Entre com o número 3: ");
		num3 = leia.nextInt();
		
		if (num1 <= num2 && num2 <= num3)
		{
			System.out.println("\nOrdem crescente: " + num1+", " +num2+ " e " +num3);
		}
		else if (num1 <= num3 && num3 <= num2)
		{
			System.out.println("\nOrdem crescente: " + num1+", "+num3+" e " +num2);
		}
		else if (num2 <= num1 && num1 <= num3)
		{
			System.out.println("\nOrdem crescente: " + num2+", "+num1+" e " +num3);
		}
		else if (num2 <= num3 && num3 <= num1)
		{
			System.out.println("\nOrdem crescente: " + num2+", "+num3+" e " +num1);
		}
		else if (num3 <= num1 && num1 <= num2)
		{
			System.out.println("\nOrdem crescente: " + num2+", "+num3+" e " +num1);
		}
		else
		{
			System.out.println("\nOrdem crescente: " + num3+", "+num2+" e " +num1);

		}

	}

}
