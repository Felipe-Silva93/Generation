package Generatioex1;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		/*1-	Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior*/
		
		
		int a,b,c,maior=0;
		
		Scanner ler=new Scanner(System.in);
		
		System.out.println("digite um numero: ");
		a=ler.nextInt();
		System.out.println("digite um numero: ");
		b=ler.nextInt();
		System.out.println("digite um numero: ");
		c=ler.nextInt();
		
		if(maior<a) {
			
			maior=a;
			
			System.out.println(maior);
			
		}if(maior<b) {
			maior=b;
			
			System.out.println(maior);
			
		}if(maior<c){
			maior=c;
			
			System.out.println(maior);
			
			
		}
		System.out.println("numeros digitados foram "+a+" , "+b+" e "+c);
		System.out.println("o maior foi: "+maior);
;		

	}

}
