package javaPoo;

public class Cliente {
	
	/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
	//atributos
	private String nome;
	private Boolean comprou;
	private int idade;
	
	//metodos
	
	public  Cliente(String x,int e,Boolean b) {
		
		this.nome=x;
		this.idade=e;
		this.comprou=b;
	}
	
	
	

	public void Comprou() {
		if(comprou==true) {
			
			System.out.println("volte sempre");
		}
		else {
			System.out.println("descupe não ter a mercadoria desejada");
			
			
			
		}
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getComprou() {
		return comprou;
	}

	public void setComprou(Boolean comprou) {
		this.comprou = comprou;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	
	
	
}
