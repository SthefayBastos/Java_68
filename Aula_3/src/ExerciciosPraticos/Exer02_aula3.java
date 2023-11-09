package ExerciciosPraticos;

import java.util.Scanner;

public class Exer02_aula3 {

	
		static Scanner leia = new Scanner(System.in);
		public static void main(String[] args) {
			
			int num;
			String parOuImpar, sinal;
			
			System.out.println("Digite o valor: ");
			num = leia.nextInt();

			if (num % 2 == 0) {
				parOuImpar = "par";
			} else {
				parOuImpar = "ímpar";
			}
			if (num >= 0) {
				sinal = "positivo";
			} else {
				sinal = "negativo";
			}
			
			System.out.printf("O Número é %s e %s!", parOuImpar, sinal);

	}

}
