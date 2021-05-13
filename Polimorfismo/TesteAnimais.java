package heranca;

public class TesteAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Preguica lenta=new Preguica("lenta",120);
		 Cachorro lala= new Cachorro("lala",100);
		 Cavalo veloz = new Cavalo("veloz",80, 2, true);
		
		 
		 lala.emitirSom();
		 veloz.emitirSom();
		 lenta.emitirSom();
		 
		 
	}

}
