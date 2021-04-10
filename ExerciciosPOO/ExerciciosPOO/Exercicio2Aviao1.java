package ExerciciosPOO;

/*2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto avião, defina as instancias deste objeto
 *  e apresente as informações deste objeto no console.*/

public class Exercicio2Aviao1 { // CLASSE
	
	// ATRIBUTOS
	private String nomeAviao;
	private String modelo;
	private String destino;
	private String companhia;
	private int total_passageiros=0;
	private double peso;
	private boolean status;
	
	// CONSTRUTOR
	public Exercicio2Aviao1(String nomeAviao, String modelo, String destino, String companhia, int total_passageiros, double peso, boolean status)
	{
		this.nomeAviao = nomeAviao;
		this.modelo = modelo;
		this.destino = destino;
		this.companhia = companhia;
		this.total_passageiros = total_passageiros;
		this.peso = peso;
		this.status = false;
	}
	
	// MÉTODO
	public void statusAngar()
	{
		this.status = false;
	}
	
	public void statusVoando()
	{
		this.status = true;
	}
	
	public String verificaStatus()
	{
		if(status)
		{
			return "Em voo -- Indisponível";
		}
		else 
		{
			return "No angar -- Dísponível";
		}
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nO avião de nome "+nomeAviao+" do modelo "+modelo+" com destino para "+destino+" da companhia aérea "+companhia+" possui capacidade para "+total_passageiros+" passageiros, com peso total: "+peso+" toneladas"+"\nDisponibilidade: "+ verificaStatus());
	}

	public String getNomeAviao() {
		return nomeAviao;
	}

	public void setNomeAviao(String nomeAviao) {
		this.nomeAviao = nomeAviao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public int getTotal_passageiros() {
		return total_passageiros;
	}

	public void setTotal_passageiros(int total_passageiros) {
		this.total_passageiros = total_passageiros;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
