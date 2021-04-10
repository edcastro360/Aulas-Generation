package Turma20;

public class TesteEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado[] objetoEmpregado = new Empregado[3];
		
		objetoEmpregado[0] = new Empregado("Juliana Ferreira",3000);
		objetoEmpregado[1] = new Empregado("Kátia Bianconi",5000);
		objetoEmpregado[2] = new Empregado("Isac",4000);
		
		for(int x=0; x<=2; x++)
		{
			objetoEmpregado[x].imprimirInfo();
		}
		
		System.out.println("\n************************************\n");
		
		for(Empregado variavelloop:objetoEmpregado) // Percorrendo a classe empregado com o vetor objetoEmpregado[]
		{
			variavelloop.imprimirInfo();
		}
		
		System.out.println("\n************************************\n");
		
		for(Empregado variavelloop:objetoEmpregado)
		{
			variavelloop.aumentarSalario(10);
			variavelloop.imprimirInfo();
		}
		
		System.out.println("\n************************************\n");


	}

}
