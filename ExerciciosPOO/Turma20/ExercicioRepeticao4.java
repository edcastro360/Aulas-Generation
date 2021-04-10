package Turma20;

import java.util.Scanner;

public class ExercicioRepeticao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubcas
		int idade,sexo,fp,contpc=0,contmn=0,contha=0,contoc=0,contpn40=0,contpc18=0,np=1;
		
		Scanner leia = new Scanner (System.in);
		
		while(np<=5)
		{
			System.out.println("\nEntre com a sua idade: ");
			idade = leia.nextInt();
			System.out.println("\n1-Feminino\n2- Masculino\n3- Outros\nEntre com o seu sexo: ");
			sexo = leia.nextInt();
			System.out.println("\n1- Calmo/a/e\n2- Nervoso/a/e\n3- Agressivo/a/e\nEntre com o fator psicológico: ");
			fp = leia.nextInt();
			
			if(fp==1)
			{
				contpc++;
			}
			if(sexo==1 && fp==2)
			{
				contmn++;
			}
			if(sexo==2 && fp==3)
			{
				contha++;
			}
			if(sexo==3 && fp==1)
			{
				contoc++;
			}
			if(fp==2 && idade>40)
			{
				contpn40++;
			}
			if(fp==1 && idade<18)
			{
				contpc18++;
			}
			np++;
			
		}
		System.out.println("\nPessoas calmas/os/es: "+contpc);
		System.out.println("\nMulheres nervosas/os/es: "+contmn);
		System.out.println("\nHomens agressivos/as/es: "+contha);
		System.out.println("\nOutros calmos/as/es: "+contoc);
		System.out.println("\nPessoas nervosas/os/es com mais de 40 anos: "+contpn40);
		System.out.println("\nPessoas calmas/os/es com menos de 18 anos: "+contpc18);
	}

}

