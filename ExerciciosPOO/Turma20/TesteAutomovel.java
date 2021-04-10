package Turma20;

public class TesteAutomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automovel auto1 = new Automovel("Edmar Castro","Escort Hobby Azul","ABC-1234",1995);
		
		// Troca de mensagens (Chamada ao método imprimirInfo()
		
		auto1.imprimirInfo();
		
		System.out.println("\n***Transferência de Proprietário***");
		auto1.setNomeProprietario("Rodrigo Teixeira");
		
		auto1.imprimirInfo();
		
		Automovel auto2 = new Automovel("Fiuza", "Fusca","AMOR",2021);
		
		auto2.imprimirInfo();
		
		auto2.setPlaca("DESGRAÇA");
		
		auto2.imprimirInfo();
		
		
		
	}

}
