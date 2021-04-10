package Heranca;

public class TesteProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfessorDE prof1 = new ProfessorDE();
		ProfessorHorista prof2 = new ProfessorHorista();
		ProfessorBolsista prof3 = new ProfessorBolsista();

		prof1.setMatricula(1);
		prof1.setNome("Mi Souza");
		prof1.setSalario(10000);
		
		prof2.setMatricula(2);
		prof2.setNome("Thaís");
		prof2.setValorHora(100);
		prof2.setNumeroHoras(50);
		
		prof3.setMatricula(3);
		prof3.setNome("Fiuza");
		prof3.setvalorBolsa(2000);

		System.out.println("\n Salário Prof. 1 = " + prof1.getSalario());
		System.out.println("\n Salário Prof. 2 = " + prof2.getSalario());
		System.out.println("\n Salário Prof. 3 = " + prof3.getSalario());

		
		
	}

}
