package Turma20;

import java.util.Scanner;

public class Decisao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3,media;
		
		Scanner venha = new Scanner(System.in);
		
		System.out.print("Entre com a primeiro nota: ");
		n1 = venha.nextFloat();
		System.out.println("Entre com a segunda nota: ");
		n2 = venha.nextFloat();
		System.out.println("Entre com a terceira nota: ");
		n3 = venha.nextFloat();
		
		media = (n1+n2+n3) / 3;
		
		System.out.println("\nM�dia aritm�tica: " + media);
		
		if (media >= 7 && media <= 20)
		{
			System.out.println("\nParab�ns, voc� foi aprovado!");
		}
		else if (media >= 4 && media < 7)
		{
			System.out.println("\nAluno de exame!");
		}
		else if (media >= 0 && media < 4)
		{
			System.out.println("\nAluno reprovado!");
		}
		else
		{
			System.out.println("\nM�dia fora do intervalo!");
		}
		
		System.out.printf("Com as notas: %f, %f e %f eu vou obter a m�dia: %2.2f",n1,n2,n3,media);

	}

}
