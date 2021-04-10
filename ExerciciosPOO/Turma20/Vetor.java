package Turma20;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quantidade;
		double media=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o tamanho do Vetor1: ");
		quantidade = leia.nextInt();
		
		double[] vetor1 = new double[quantidade];
		
		for(int i=0;i<quantidade;i++)
		{
			System.out.println("\nInforme a "+(i+1)+" a. nota");
			vetor1[i] = leia.nextDouble();
		}
		
		for(int i=0;i<quantidade;i++)
		{
			media = media + vetor1[i];
		}
		
		media = media / quantidade;
		System.out.println("\nA média foi de: "+media);
		
		String maior = "Nota(s) acima da média : ",menor = " Nota(s) abaixo da média: ";
		
		for(int i=0;i<quantidade;i++)
		{
			if(vetor1[i]>media)
			{
				maior = maior + vetor1[i] + "  ";
			}
			else 
			{
				menor = menor + vetor1[i] + "  ";
			}
		}
		System.out.println(maior);
		System.out.println(menor);
		
	}

}
