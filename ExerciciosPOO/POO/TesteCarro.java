package POO;

public class TesteCarro { // Classe

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Atributos
		Carro meuCarro = new Carro();
		meuCarro.cor = "Prata";
		meuCarro.modelo = "Peugeot";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 120;
		
		
		// Métodos
		meuCarro.liga();
		
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);
		meuCarro.pegaMarcha();
	}

}
