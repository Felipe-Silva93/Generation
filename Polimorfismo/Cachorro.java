package heranca;

public class Cachorro extends Animal{
	
	//atributos
	 boolean manso;
	
	

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		this.manso=true;
		
		
			
		}
	@Override
	public void emitirSom() {
		System.out.println("latindo,  uau uau");
	}
	
	public void correr() {
		System.out.println("Estou correndo livrimente .......");
	}

	public boolean getManso() {
		return manso;
	}

	public void setManso(boolean manso) {
		this.manso = manso;
	}
	
}

	
	


