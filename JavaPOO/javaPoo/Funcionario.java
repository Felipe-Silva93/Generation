package javaPoo;

public class Funcionario {
	
	/*4) Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe, 
	 * em seguida crie um objeto funcion�rio, 
	 * defina as instancias deste objeto e apresente as informa��es deste objeto no console.*/
	
	
	private String Nome;
	private float Salario;
	private float Aumento;
	private int HorasTrabalhadas;
	
	
	public void salariomelhor() {
		
		Salario=Aumento+100;
		System.out.println(Salario);
		
	}
	
	public void Trabalho() {
		
		System.out.println("voc� trabalhou "+HorasTrabalhadas);
	}

	public float getSalario() {
		return Salario;
	}

	public void setSalario(float salario) {
		Salario = salario;
	}

	public float getAumento() {
		return Aumento;
	}

	public void setAumento(float aumento) {
		Aumento = aumento;
	}

	public int getHorasTrabalhadas() {
		return HorasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		HorasTrabalhadas = horasTrabalhadas;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	

}
