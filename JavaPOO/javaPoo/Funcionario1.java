package javaPoo;

public class Funcionario1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario f1=new Funcionario();
		f1.setNome("joana");
		f1.setSalario(100);
		f1.setAumento(150);
		f1.Trabalho();
		
		System.out.println(f1.getNome()+"\n"+f1.getAumento()+"\n"+f1.getHorasTrabalhadas());
	}
}
