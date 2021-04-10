package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<String> nomes = new ArrayList();
		
		nomes.add("Feijão");
		nomes.add("Arroz");
		nomes.add("Macarrão");
		nomes.add("Açucar");
		
		for(String name : nomes)
		{
			System.out.println("Lista de nomes: " + name);
		}
		
		
		
		//Collection<String> nomes2 = Arrays.asList("Sal","Farinha");
		//nomes.addAll(nomes2);
		
		//System.out.println("Lista de nomes: " + nomes);
		
		
		//System.out.println("Contém o nome Macarrão? " + nomes.contains("Macarrão"));
		//System.out.println("Lista de nomes: " + nomes);
		
		
		/*System.out.println("Lista de nomes: " + nomes);
		nomes.clear();

		System.out.println("Lista de nomes: " + nomes);*/

		
		
		/*System.out.println("Lista de nomes: " + nomes);

		nomes.remove("Arroz");
		
		System.out.println("Lista de nomes: " + nomes);*/

		
		/*if(nomes.isEmpty())
		{
			System.out.println("Lista vazia!");
		}
		else
		{
			System.out.println("Lista de nomes: " + nomes);
		}
		
		System.out.println("Lista de nomes: " + nomes);*/


	}

}
