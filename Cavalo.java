package Exercicios;

public class Cavalo extends Animais implements InterAnimal1 {
	
	@Override
	public void correrelocomover() {
    
		 System.out.println("Cavalo trota");
}

	
	@Override
	public void som() {
	 System.out.println("Cavalo relincha");

	}


}
