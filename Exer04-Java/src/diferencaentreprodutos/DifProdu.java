package diferencaentreprodutos;

import java.util.Scanner;

public class DifProdu {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		float num1, num2, num3, num4,dif;
		System.out.println("Digite abaixo 4 números: ");
		num1 = leia.nextFloat();
		num2 = leia.nextFloat();
		num3 = leia.nextFloat();
		num4 = leia.nextFloat();
		
		System.out.println("O produto entre o nº1 e o nº 2 é: " + (num1*num2));
		System.out.println("O produto entre o nº3 e o nº4 é: " + (num3*num4));
		dif = (num1*num2)-(num3*num4);
		System.out.println("A diferença entre os resultados é: " + dif);
		
	}

}
