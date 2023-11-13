package Atividades;

import java.util.Scanner;

public class Exer02_aula5 {
   /*Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. 
    * Em seguida, mostre na tela:Todos os elementos dos índices ímpares do vetor 
	>Todos os elementos do vetor que são números pares
	>A Soma de todos os elementos do vetor
	>A Média de todos os elementos do vetor, armazenada em uma variável do tipo real.
*/
	
	static Scanner leia = new Scanner (System.in);
	public static void main(String[] args) {
		int  vetNumIn [] = new int [10] ;
		int somaElem = 0;
		float mediaTodosElem = 0.0f;
		
		
		for (int indice = 0; indice < 10; indice ++) {
		
		System.out.println("Digite um número:");
		vetNumIn[indice] = leia.nextInt();
		somaElem += vetNumIn[indice];
		mediaTodosElem =  (((float)somaElem) / vetNumIn[indice]);
		}
		
		
		for (int indice = 0; indice < vetNumIn.length; indice++) {
			if(vetNumIn[indice] % 2 != 0)
				System.out.println("Estes são os elementos ímpares | " + vetNumIn[indice] + "|");
		}
			for (int indice = 0; indice < vetNumIn.length; indice++) {	
			if(vetNumIn[indice] % 2 == 0)
				System.out.println("Estes são os elementos pares | " + vetNumIn[indice] + "|");
			}
			System.out.println("Aqui está a soma de todos os elementos: " + somaElem);
			System.out.printf("Aqui está a média dos elementos: %.f" , mediaTodosElem);
		
	} 	
		
	}

	

