package vetor;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		/* 1- Faça um programa que possua um vetor denominado A que armazene 6 números
		inteiros. O programa deve executar os seguintes passos:
		(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
		(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições
		A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
		(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
		(d) Mostre na tela cada valor do vetor A, um em cada linha. */
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

