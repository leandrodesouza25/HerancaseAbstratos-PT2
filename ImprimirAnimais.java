package Exercicios;

public class ImprimirAnimais {

	public static void main(String[] args) {
		
		Cachorro a1 = new Cachorro();
		Cavalo a2 = new Cavalo();
		Preguica a3 = new Preguica();
		
		a1.setNome("Rex");
		a1.setIdade(2);
		a1.setRaca("Shi-Tzu");
		
		a2.setNome("Al�pio");
		a2.setIdade(5);
		a2.setRaca("P�nei");
		
		a3.setNome("Dormi�a");
		a3.setIdade(3);
		a3.setRaca("???");
		
		
		a1.correrelocomover();
		a1.som();
		
		a2.correrelocomover();
		a2.som();
		
		a3.correrelocomover();
		a3.som();
		
		System.out.println("Nome: " + a1.getNome());
        System.out.println("\nIdade: " + a1.getIdade());
	    System.out.println("\nRa�a: " + a1.getRaca());
	    
	    System.out.println("________________________");
	    
	    
	    System.out.println("\nNome: " + a2.getNome());
        System.out.println("\nIdade: " + a2.getIdade());
	    System.out.println("\nRa�a: " + a2.getRaca());
	   
	   System.out.println("________________________"); 
	    
	    System.out.println("\nNome: " + a3.getNome());
        System.out.println("\nIdade: " + a3.getIdade());
	    System.out.println("\nRa�a: " + a3.getRaca());
	}

}
