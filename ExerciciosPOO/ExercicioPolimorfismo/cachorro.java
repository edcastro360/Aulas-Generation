package ExercicioPolimorfismo;

public class cachorro extends Animal{
	

	private String raca;
	private boolean correr;
	
	
	
	public cachorro (String _nome, String _idade, String tipo, String raca)
	{
		super(_nome,_idade,tipo);
		this.raca = raca;
	}
	
	
	@Override
	public void Acao(int c) 
	{
		// TODO Auto-generated method stub
		
	 	switch (c) 
    	{
    	case 1:
    		this.correr = true;
    		break;
    	case 2:
    		this.correr = false;
    		break;
    	}   	             	        	
	
		    	
	}
		

    
    public void ImprimirInfo() 
    {
         	             	        	
    	System.out.println("O nome do cachorrinho � "+nome+". \nEle � um "+tipo+" da ra�a "+raca+" e tem "+idade+" anos de idade. \nEle est� fazendo alguma a��o agora? "+correr+". \nE est� emitindo algum som? "+emitirSom);
        
    }


}