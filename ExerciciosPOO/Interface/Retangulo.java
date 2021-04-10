package Interface;

public class Retangulo extends BaseFigura implements Figuras {
	
	Retangulo(double lado1, double lado2, String nome)
	{
		super(lado1, lado2, nome);
		nomeClasse = "Retangulo";
	}
	
	public double getDiagonal()
	{
		return Math.sqrt(Math.pow(lado1, 2)+Math.pow(lado2,2));
	}

	@Override
	public String getNomw() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
