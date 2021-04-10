package Turma20;

import java.util.Scanner;

public class IntroducaoJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3,media;
		double resultado;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota: ");
		n1 = ler.nextFloat();
		System.out.println("Entre com a segunda nota: ");
		n2 = ler.nextFloat();
		System.out.println("Entre com a terceira nota: ");
		n3 = ler.nextFloat();
		
		// media = n1%2;
		resultado = Math.sqrt(n1);
		resultado = Math.pow(n2, 2);
		media = (n1+n2+n3)/3;
		
		System.out.println("\nMédia do aluno: "+media);
		System.out.printf("\nMédia do aluno: %2.2f",media);
		

	}

}
