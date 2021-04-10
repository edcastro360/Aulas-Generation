package Polimorfismo;

public class TelefoneFixo extends Telefone {
	
	public TelefoneFixo()
	{
		super("Fixo");
	}
	
	@Override
	public void toca(int paraNumToques)
	{
		for(int i=0; i<paraNumToques; i++)
		{
			System.out.println("\nZZZZZZZ...ZZZZZZZZ");
		}
	}
	
	@Override
	public void disca(String paraNumero)
	{
		System.out.println("\nDiscando para o número: " + paraNumero);
	}

}
