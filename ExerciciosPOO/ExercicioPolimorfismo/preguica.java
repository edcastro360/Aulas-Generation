package ExercicioPolimorfismo;

public class preguica extends Animal {
	
	private String origem;
	private boolean subir;
	
	
	public preguica (String _nome, String _idade, String tipo, String origem)
	{
		super(_nome,_idade, tipo);
		
		this.origem = origem;
		
				
	}

	@Override
	public void Acao(int c) {
		// TODO Auto-generated method stub
       	             	        	
    	switch (c) 
    	{
    	case 1:
    		this.subir = true;
    		break;
    	case 2:
    		this.subir = false;
    		break;
    	}
    	
    }
    
    
	@Override
    public void ImprimirInfo() 
    {     	        	
    	System.out.println("O nome da preguicinha é "+nome+". \nEle é um "+tipo+", e ele tem "+idade+" anos de idade e tem origem da "+origem+". \nAgora ele está subindo em árvores? "+subir+". \nEle está emitindo algum som agora? "+emitirSom); 
    }
      

}