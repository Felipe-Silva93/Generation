package heranca;

public class Animal {
	// atributo
	private String nome;
	private int idade;
	
	
	public void emitirSom() {
		System.out.println("som som testando....");
	}
	
	public void correr() {
		System.out.println("agora dando uma corridinha");
	}
	
	

	

	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
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
	
}
