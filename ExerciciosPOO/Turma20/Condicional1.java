package Turma20;

import java.util.Scanner;

public class Condicional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		int idade;
		String nome;
		
		System.out.printf("Entreo com a sua idade: ");
		idade = ler.nextInt();
		ler.nextLine();
		System.out.printf("Entre com o seu nome: ");
		nome = ler.nextLine();
		System.out.printf("\nSeu nome: %s", nome);
		System.out.printf("\nSua idade: %d", idade);
		
		if (idade >= 18)
		{
			System.out.printf("\nVoc� � maior de idade!");
		}
		else if (idade >=1 && idade <18)
		{
			System.out.printf("\nVoc� � menor de idade!");
		}
		else
		{
			System.out.printf("\nVoc� entrou com uma idade inv�lida!");
		}

	}

}