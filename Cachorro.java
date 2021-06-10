package Exercicios;

public class Cachorro extends Animais implements InterAnimal1 {

	@Override
	public void correrelocomover() {
		
		System.out.println("Cachorro corre quadrúpede");
	
	
	}

	@Override
	public void som() {
		System.out.println("Cachorro late..auau");
		
	}

	
	
	
}
