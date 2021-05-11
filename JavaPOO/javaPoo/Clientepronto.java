package javaPoo;

public class Clientepronto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente c1 = new Cliente("jaja",20,false);
		System.out.println("a cliente é "+c1.getNome());
		System.out.println("a cliente tem "+c1.getIdade()+"anos ");
		c1.Comprou();
		
		

	}

}
