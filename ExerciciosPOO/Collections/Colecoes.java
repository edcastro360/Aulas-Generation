package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<String> nomes = new ArrayList();
		
		nomes.add("Feij�o");
		nomes.add("Arroz");
		nomes.add("Macarr�o");
		nomes.add("A�ucar");
		
		for(String name : nomes)
		{
			System.out.println("Lista de nomes: " + name);
		}
		
		
		
		//Collection<String> nomes2 = Arrays.asList("Sal","Farinha");
		//nomes.addAll(nomes2);
		
		//System.out.println("Lista de nomes: " + nomes);
		
		
		//System.out.println("Cont�m o nome Macarr�o? " + nomes.contains("Macarr�o"));
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
