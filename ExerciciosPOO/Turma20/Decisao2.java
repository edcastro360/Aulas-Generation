package Turma20;

import java.util.Scanner;

public class Decisao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num1, num2, res;
		char op;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Menu de op��es \n+ --> Soma\n- --> Menos\n* --> Multiplica��o\n/ --> Divis�o");
		op = leia.nextLine().charAt(0);
		
		System.out.println("\nEntre com o primeiro n�mero: ");
		num1 = leia.nextFloat();
		System.out.println("\nEntre com o segundo n�mero: ");
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
				System.out.println("\nOp��o inv�lida! Voc� digitou este caracter: " + op);
		}
		System.out.println("\nResultado: " + res + "... Opera��o conclu�da!");
	}
}
