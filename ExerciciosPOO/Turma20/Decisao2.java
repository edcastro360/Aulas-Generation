package Turma20;

import java.util.Scanner;

public class Decisao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num1, num2, res;
		char op;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Menu de opções \n+ --> Soma\n- --> Menos\n* --> Multiplicação\n/ --> Divisão");
		op = leia.nextLine().charAt(0);
		
		System.out.println("\nEntre com o primeiro número: ");
		num1 = leia.nextFloat();
		System.out.println("\nEntre com o segundo número: ");
		num2 = leia.nextFloat();
		
		switch(op)
		{
		case '+':
			res = num1 + num2;
			break;
		case '-':
			res = num1 - num2;
			break;
		case '*':
			res = num1 * num2;
			break;
		case '/':
			res = num1 / num2;
			break;
			default:
				res = 0;
				System.out.println("\nOpção inválida! Você digitou este caracter: " + op);
		}
		System.out.println("\nResultado: " + res + "... Operação concluída!");
	}
}
