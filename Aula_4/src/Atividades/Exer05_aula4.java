package Atividades;

import java.util.Scanner;

public class Exer05_aula4 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {

		int num, tPositivo = 0;

		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if(num >= 0) {
				tPositivo += num;
			}
		} while (num != 0);

		System.out.printf("A soma dos números positivos é: %d", tPositivo);
	}

}