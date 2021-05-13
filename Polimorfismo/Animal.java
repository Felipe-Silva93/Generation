package heranca;

public abstract class Animal {
	// atributo
	private String nome;
	private int idade;
	

	public abstract void emitirSom(); 
	
	
		
	
	
	

	

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
