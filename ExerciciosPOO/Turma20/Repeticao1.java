package Turma20;

import java.util.Scanner;

public class Repeticao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1, n2, n3, media, mediaGeral, somaMedia=0;
		int n=1, num, somaN=0, somaPar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (int x=1; x<=3; x++) // x++ = x=x+1
		{
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			
			System.out.println("Entre com a segunda nota: ");
			n2 = leia.nextFloat();
			
			System.out.println("Entre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media = (n1+n2+n3) / 3; // 7,7 6,3 8,9
			System.out.printf("\nA m�dia do aluno �: %2.2f", media);
			
			somaMedia = somaMedia + media;			
			
		}
						
		mediaGeral = somaMedia / 3;
		System.out.printf("\nA m�dia geral da turma �: %2.2f", mediaGeral);
		
		
		
		System.out.println("\nEntre com a quantidade de repeti��es: ");
		num = leia.nextInt(); // 6
		
		while (n<=num)
		{
			somaN = somaN + n;
			n++; // n = n+1
		}
		System.out.println("\nO somat�rio de n�meros: "+ somaN);
		
		
		do 
		{
			System.out.println("\nEntre com um n�mero: ");
			num = leia.nextInt(); // 5 -8
			if (num % 2==0)
			{
				somaPar = somaPar + num;
			}
		}
		while(num >= 0);

	}

}
