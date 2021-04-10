package ExerciciosPOO;

import java.util.Scanner;

public class Exercicio2Aviao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
		Exercicio2Aviao1 aviao1 = new Exercicio2Aviao1("14-bis","Boeing 737","Acapulco","Latan", 189, 2.800, false);
		
		// Troca de mensagens (chamada ao método imprimirInfo()

		aviao1.imprimirInfo();
		
		System.out.println("\n####################################################### Transferência de companhia ###############################################################");
		aviao1.setCompanhia("Gol");
		
		aviao1.imprimirInfo();
		
		System.out.println("\n**************************************************************************************************************************************************");
		
		Exercicio2Aviao1 aviao2 = new Exercicio2Aviao1("Jackie Chan","Embraer Legacy 650","Chinatown","Jack", 6, 1.100, true);
		
		aviao2.imprimirInfo();
		
		System.out.println("\n####################################################### Transferência de dono ####################################################################");

		aviao2.setNomeAviao("Bruce Lee");
		
		aviao2.imprimirInfo();
		
		
	}

}
