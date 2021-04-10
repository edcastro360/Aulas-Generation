package Polimorfismo;

public class TelefoneCelular extends Telefone { // SUBCLASSE
	
	// ATRIBUTOS
	// NESSE CASO N�O POSSUI
	
	
	// CONSTRUTOR
	public TelefoneCelular()
	{
		super("Celular");
	}
	
	
	// M�TODOS ABSTRATOS
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
		System.out.println("\nO n�mero: " + paraNumero + " � um celular!");
	}

}
