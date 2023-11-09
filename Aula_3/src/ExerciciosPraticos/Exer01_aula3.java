package ExerciciosPraticos;

import java.util.Scanner;

public class Exer01_aula3 {


		static Scanner leia = new Scanner(System.in);
		public static void main(String[] args) {
			
			int a, b, c;
			String valor;
			
			System.out.println("Digite o valor A: ");
			a = leia.nextInt();
			System.out.println("Digite o calor B: ");
			b = leia.nextInt();
			System.out.println("Digite o calor C: ");
			c = leia.nextInt();

			int x = (a + b);

			if(x < c) {
				valor = "Menor";
			} else if (x == c) {
				valor = "Igual";
			} else {
				valor = "Maior";
			}
			
			System.out.printf("A Soma de A + B é %s em relação a C", valor);
			

	}

}
