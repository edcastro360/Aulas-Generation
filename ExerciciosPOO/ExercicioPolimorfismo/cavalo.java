package ExercicioPolimorfismo;

public class cavalo extends Animal {
	
	
	private String categoria;
	private boolean correr;
	
	
	
	public cavalo (String _nome, String _idade, String tipo, String categoria)
	{
		super(_nome,_idade,tipo);
		this.categoria = categoria;
	}
	
	
	@Override
	public void Acao(int c) {
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
         	             	        	
    	System.out.println("O nome do cavalinho é "+nome+". \nEle é um "+tipo+" da categoria de "+categoria+", e tem "+idade+" anos de idade. \nEle está fazendo alguma ação agora? "+correr+". \nE está emitindo algum som? "+emitirSom);
        
    }       

}