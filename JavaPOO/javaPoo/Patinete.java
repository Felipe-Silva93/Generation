package javaPoo;

public class Patinete {
/*5) Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
	//atributos
	String cor;
	float tamanho;
	String cordaroda;
	Boolean travado;
	
	public void andar() {
		if(travado==true) {
			System.out.println("ele está com trava, você não andarás...kkkk");
		}
		else {
			System.out.println("patinete destravado, vá fazer o seu rolezinho...kkkk");
		}
	}
	public void impinar() {
		if(tamanho>1.0) {
			System.out.println(" tamanho de patinete profissional, você pode impinar");
		}
		else {
			System.out.println("patinete pequeno, você não pode impinar");
		}
	}
	public void imprimir() {
		System.out.println("ele está \n");
		System.out.println(getCor());
		System.out.println(getCordaroda());
		System.out.println(getTamanho());
		System.out.println(getTravado());
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	public String getCordaroda() {
		return cordaroda;
	}
	public void setCordaroda(String cordaroda) {
		this.cordaroda = cordaroda;
	}
	public Boolean getTravado() {
		return travado;
	}
	public void setTravado(Boolean travado) {
		this.travado = travado;
	}
	
	
}
