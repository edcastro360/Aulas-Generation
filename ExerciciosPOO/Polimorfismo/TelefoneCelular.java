package Polimorfismo;

public class TelefoneCelular extends Telefone { // SUBCLASSE
	
	// ATRIBUTOS
	// NESSE CASO NÃO POSSUI
	
	
	// CONSTRUTOR
	public TelefoneCelular()
	{
		super("Celular");
	}
	
	
	// MÉTODOS ABSTRATOS
	@Override
	public void toca(int paraNumToques)
	{
		switch(paraNumToques)
		{
		case 1:
			System.out.println("Trimtrimtrim... trimtrimtrim");
			break;
		case 2:
			System.out.println("Tutututu... tutututu");
			break;
			default:
				System.out.println("Nem sei... nem sei...");
				break;
		}
	}
	
	@Override
	public void disca(String paraNumero)
	{
		System.out.println("\nO número: " + paraNumero + " é um celular!");
	}

}
