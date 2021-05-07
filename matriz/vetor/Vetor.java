package vetor;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		int [] a=new int [6];
		int x,soma=0,vetor;
		
		Scanner leia =new Scanner(System.in);
		for(x=0;x<6;x++) {
			System.out.println("entre com um numero: ");
			a[x]=leia.nextInt();
			
			soma=(a[0]+a[1]+a[5]);
			
			
		}
		
	System.out.println(" a soma da posição a[0] + a[1] + a[5]= "+soma);
	System.out.println("\n a[0]="+a[0]+"\n a[1]="+a[1]+"\n a[2]="+a[2]+"\n a[3]="+a[3]+"\n a[4]="+a[4]+"\n a[5]="+a[5]);
	
}
}

