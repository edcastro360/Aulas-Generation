package ExercicioHeranca;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("-------Teste da Classe Animal--------");
		
		String nome;
		int idade;
		boolean som;
		boolean correr;
		boolean subir;
		
		Animal teddy = new Animal ("teddy", 12, "ruuu, roar");
		Cachorro beethoven = new Cachorro ("beethoven", 6, "Au au", false);		
		Cavalo pegaso = new Cavalo ("P�gaso", 20, "hinn in in", true);
		Preguica preguicinha = new Preguica ("Preguicinha", 60, "uaaaaaaa", true);
		
		teddy.getNome();
		teddy.getIdade();
		teddy.getSom();
		
		beethoven.getNome();
		beethoven.getIdade();
		beethoven.getSom();
		
		pegaso.getNome();
		pegaso.getIdade();
		pegaso.getSom();
		
		preguicinha.getNome();
		preguicinha.getIdade();
		preguicinha.getSom();
		
		
		System.out.println("\nO nome do ursinho � " + teddy.getNome());
		System.out.println("\nO teddinho tem " + teddy.getIdade()+" anos");
		System.out.println("\nEle faz " + teddy.getSom());

		System.out.println("\nO nome do cachorro � " + beethoven.getNome());
		System.out.println("\nO beethoven tem " + beethoven.getIdade()+" anos");
		System.out.println("\nEle faz " + beethoven.getSom());

		System.out.println("\nO nome do cavalo � " + pegaso.getNome());
		System.out.println("\nO p�gaso tem " + pegaso.getIdade()+" anos");
		System.out.println("\nEle faz " + pegaso.getSom());
	
		System.out.println("\nO nome da pregui�a � " + preguicinha.getNome());
		System.out.println("\nA preguicinha tem " + preguicinha.getIdade()+" anos");
		System.out.println("\nEle faz " + preguicinha.getSom());
		
	}
}