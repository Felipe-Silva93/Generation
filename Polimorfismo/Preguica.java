package heranca;

public class Preguica extends Animal {

	//atributo
	boolean lenta;
	String endereco;
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
		this.endereco="arvore";
		this.lenta=true;
		
	}
	
	@Override
	public void emitirSom() {
		System.out.println("crick crick");
	}
	
	public void correr() {
		System.out.println("Estou pulando de galho em galho .......");
	}
	public boolean getLenta() {
		return lenta;
	}
	public void setLenta(boolean lenta) {
		this.lenta = lenta;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
	

}
