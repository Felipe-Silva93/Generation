package vetor;

import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		int [][]matriz=new int[3][3];
		int linha,coluna,cont=0;
		
		Scanner ler=new Scanner(System.in);
		
		
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("digite um numero: ");
				matriz[linha][coluna]=ler.nextInt();
				
				if(matriz[linha][coluna]>10) {
					
						cont++;
					}
				
			}
		}
			for(linha=0;linha<3;linha++) {
				for(coluna=0;coluna<3;coluna++) {
					System.out.println(matriz[linha][coluna]);
					
		
				}
	        }
			System.out.println(" a matriz possui  "+cont+"  valores maior do que o 10 ");
   }

}
