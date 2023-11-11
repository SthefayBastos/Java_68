package Atividades;

import java.util.Scanner;

/* Escreva um algoritmo em Java, que leia 10 números inteiros
 * via teclado e mostre na tela quantos 
 *  números são pares e quantos número são ímpares. 
 * */
public class Exer02_aula4 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int num = 0, qntdPar = 0, qntdImpar = 0;

		for (int cont = 1; cont <= 10; cont++) {
			System.out.println("Digite um número");
			num = entrada.nextInt();

			if (num % 2 == 0) {
				qntdPar++;
			} else {
				qntdImpar++;
			}
		}
		System.out.println("Total de números pares: " + qntdPar);
		System.out.println("Total de números ímpares: " + qntdImpar);
	}

}
