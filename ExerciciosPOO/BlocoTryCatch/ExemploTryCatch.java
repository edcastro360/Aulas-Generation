package BlocoTryCatch;

import java.io.FileReader;
import java.io.IOException;

public class ExemploTryCatch {

	public static void main(String args[])
	{
	String frase = null;
	String novaFrase = null;
	try
	{
	novaFrase = frase.toUpperCase();
	}
	catch (NullPointerException e) //CAPTURA DA POSS�VEL EXCE��O
	{
	//TRATAMENTO DA EXCE��O
	System.out.println("O frase inicial est� nula,para solucional tal o problema, foi lhe atribuito um valor default");
	
	frase = "Frase vazia";
	novaFrase = frase.toUpperCase();
	}
	System.out.println("Frase anga: "+frase);
	System.out.println("Frase nova: "+novaFrase);
	}
	
	/*void readFile(String name) throws IOException {
		FileReader file = null;
		try { file = new FileReader(name); // l� o arquivo }
		catch (Exception e)
		{ System.out.println(e); }
		finally {
		if (file != null)
		file.close(); } }*/

	
}
