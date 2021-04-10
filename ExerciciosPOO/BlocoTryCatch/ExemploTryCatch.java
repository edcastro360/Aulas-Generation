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
	catch (NullPointerException e) //CAPTURA DA POSSÍVEL EXCEÇÃO
	{
	//TRATAMENTO DA EXCEÇÃO
	System.out.println("O frase inicial está nula,para solucional tal o problema, foi lhe atribuito um valor default");
	
	frase = "Frase vazia";
	novaFrase = frase.toUpperCase();
	}
	System.out.println("Frase anga: "+frase);
	System.out.println("Frase nova: "+novaFrase);
	}
	
	/*void readFile(String name) throws IOException {
		FileReader file = null;
		try { file = new FileReader(name); // lê o arquivo }
		catch (Exception e)
		{ System.out.println(e); }
		finally {
		if (file != null)
		file.close(); } }*/

	
}
