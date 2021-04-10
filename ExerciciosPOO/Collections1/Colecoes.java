package Collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colecoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> minhaLista = new ArrayList<Integer>(); // CRIAR O MEU LIST
		
		minhaLista.add(2); // ADICIONAR ELEMENTO AO MEU ARRAYLIST
		minhaLista.add(1);
		minhaLista.add(3);
		minhaLista.add(3);
		minhaLista.add(1);
		
		for(Integer lista: minhaLista)
		{
			System.out.println(lista);
		}
		
		System.out.println("\nRemovendo um elemento da lista");
		System.out.println();
		
		minhaLista.remove(0); // REMOVER ELEMENTOS DO MEU ARRAYLIST
		
		for(Integer lista: minhaLista)
		{
			System.out.println(lista);
		}
		
		int primeiroElemento = minhaLista.get(0); // PEGAR UM ELEMENTO ESPECÍFICO DO MEU ARRAYLIST
		System.out.println("\nO primeiro elemento é: "+primeiroElemento);
		
		for(int i=0; i<minhaLista.size(); i++) //VERIFICAR O TAMANHO DO MEU ARRAYLIST
		{
			System.out.println("Elemento: " + minhaLista.get(i)); // PEGAR ELEMENTO DO MEU ARRAYLIST	
		}
		
		Collections.sort(minhaLista); // ORDENAR A MINHA LISTA
		
		System.out.println("\nDepois de ordenado");
		System.out.println(minhaLista);
		
		System.out.println();
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(2);
		meuSet.add(1);
		meuSet.add(3);
		meuSet.add(1);
		
		meuSet.addAll(minhaLista);
		
		Iterator<Integer> iMeuSet = meuSet.iterator();

		while (iMeuSet.hasNext())
		{
			System.out.println(iMeuSet.next());
				}
		
	}

}
