package Exercicios;

public class Animais implements InterAnimal1 {

	
	private String nome;
	private int idade;
	private String raca;
	@Override
	public void correrelocomover() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void som() {
		// TODO Auto-generated method stub
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
}
