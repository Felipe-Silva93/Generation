package Generatioex1;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		/*3-	Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:*/
		
		
		int l;
		Scanner lendo=new Scanner(System.in);
		System.out.println("qual � a sua idade: ");
		l=lendo.nextInt();

		if(l<10) {
					System.out.println("super crian�a kkk");
			}
		
		else if(l>=10 && l<=14){
			
			System.out.println(" voc� � infantil");
			
		}else if(l>=15 && l<=17) {
		
			System.out.println(" juvenil");
		
	
		}else if (l>=18 && l<=25) {
		System.out.println(" adulto");
		
		}else {
		
			System.out.println("adulto de mais kkk");
	}
}
}