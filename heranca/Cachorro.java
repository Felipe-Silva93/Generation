package heranca;

public class Cachorro extends Animal{
	
	//atributos
	String manso;
	
	

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		this.manso="manso";
		
		
			
		}
	
	public void emitirSom() {
		System.out.println("latindo,  uau uau");
	}
	
	public void correr() {
		System.out.println("Estou correndo livrimente .......");
	}

	public String getManso() {
		return manso;
	}

	public void setManso(String manso) {
		this.manso = manso;
	}
	
}

	
	


