package heranca;

public class Cavalo extends Animal {
	
	//atributos
	float tamanho;
	boolean bemtratado;
	
	public Cavalo(String nome, int idade,float x,boolean xx) {
		super(nome, idade);
		this.bemtratado=true;
		this.tamanho=170;
	}
	@Override
	public void emitirSom() {
		System.out.println("rim rim rimmm");
	}
	
	public void correr() {
		System.out.println("Estou correndo livrimente .......");
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public boolean getBemtratado() {
		return bemtratado;
	}

	public void setBemtratado(boolean bemtratao) {
		this.bemtratado = bemtratao;
	}
	
	
	
	
}
