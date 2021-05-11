package heranca;

public class TesteAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Preguica lenta=new Preguica("lenta",120);
		 Cachorro lala= new Cachorro("lala",100);
		 lala.setManso("nervoso");
		 System.out.println("o cachorro lala é "+lala.getManso()+" \ne está ");
		 lala.emitirSom();
		 lala.correr();
		
		 System.out.println("a preguiça a lenta e mora na  "+lenta.getEndereco()+" \ne está ");
		 lenta.emitirSom();
		 lenta.correr();
		 
		 
	}

}
