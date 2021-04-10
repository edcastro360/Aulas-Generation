package Polimorfismo;

	public class Animal {
	
		public void comer() 
		{
			System.out.println( "Animal Comendo..." );
		}
		
		public class Cao extends Animal {
		public void comer() 
		{
			System.out.println( "Cão Comendo..." );
		}
		}
		public class Tigre extends Animal {
		public void comer() 
		{
			System.out.println( "Tirgre Comendo..." );
		}
	}
}
