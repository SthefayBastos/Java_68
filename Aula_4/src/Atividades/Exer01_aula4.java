package Atividades;

/*Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, 
 * onde o primeiro número deve ser menor do que o segundo número. 
 * Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido e
 * sair do programa.
 * No intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5.
 * */
import java.util.Scanner;

public class Exer01_aula4 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int num1, num2, intervalo;

		System.out.println("Digite dois números.");
		System.out.println("Digite o Primeiro número:");

		num1 = leia.nextInt();

		System.out.println("Digite o Segundo número:");

		num2 = leia.nextInt();
		if (num1 > num2) {
			System.out.println("Intervalo inválido. O primeiro número deve ser menor que o segundo!");
		}else {
			System.out.printf("No intervalo entre %d e %d \n" , num1 , num2);
			
			for (intervalo = num1; intervalo <= num2; intervalo++) {
				
					
				if (intervalo % 3 == 0 && intervalo % 5 == 0) {
					System.out.printf("%d é múltiplo de 3 e 5 \n" , intervalo);

				}
				
			}
		}
	}
}