package Turma20;

import java.util.Scanner;

public class ArrayExercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vetorA = {1, 0, 5, -2, -5, 7}; 
        int soma = 0;

        for(int contador = 0; contador < vetorA.length; contador++)
        {
               soma = soma + vetorA[contador]; 
        }

        System.out.println("Total: "+soma); 
        
        
	}
}
		
		
		
		