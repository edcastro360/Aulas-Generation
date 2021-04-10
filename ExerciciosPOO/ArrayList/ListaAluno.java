package ArrayList;

	import java.util.ArrayList;
	import java.util.List;
	
	import java.util.*;
	public class ListaAluno {
	public static void main(String[] args) {
	Set<Aluno> conjunto = new HashSet<Aluno>();
	Aluno a = new Aluno("Carlos Ferreira", "Java básico" , 0);
	Aluno b = new Aluno( "Maria Souza", "Python", 0);
	Aluno c = new Aluno( "Carla Silva", "Cloud", 0);
	Aluno d = new Aluno( "Maria Souza", "Python", 0);
	conjunto.add(a);
	conjunto.add(b);
	conjunto.add(c);
	conjunto.add(d);
	System.out.println(conjunto);
	}
	}

