package heranca;

public class TesteAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Preguica lenta=new Preguica("lenta",120);
		 Cachorro lala= new Cachorro("lala",100);
		 lala.setManso("nervoso");
		 System.out.println("o cachorro lala � "+lala.getManso()+" \ne est� ");
		 lala.emitirSom();
		 lala.correr();
		
		 System.out.println("a pregui�a a lenta e mora na  "+lenta.getEndereco()+" \ne est� ");
		 lenta.emitirSom();
		 lenta.correr();
		 
		 
	}

}
