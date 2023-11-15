
package Atividades;

import java.util.Scanner;

public class Exer01_aula5 {
		static Scanner leia = new Scanner (System.in);
	
	public static void main(String[] args) {
		int numI , i = 0;
		int  vetNumI [] = {8, 6, 4, 10, 2, 9, 7, 1, 3, 5}; 
		int numCorresp = -1;
		
		
		
		System.out.println("Digite um número para saber a qual posição ele pertence: \n");
		numI = leia.nextInt();
		
		for (i = 0; i < vetNumI.length; i++) {
			if (numI == vetNumI [i]) {
				numCorresp = i;
				System.out.println("O número digitado está na posição: " + i);
			
			}
			
		}
		if (numCorresp == -1) {
			System.out.println("O número " + numI + " não foi encontrado!");
		}
	
	}
		
}
