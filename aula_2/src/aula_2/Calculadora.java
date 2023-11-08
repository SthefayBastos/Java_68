package aula_2;

import java.util.Scanner; 

public class Calculadora {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
	
		double numero1, numero2;
		
		System.out.println("Digite o primeiro número");
		numero1 = leia.nextDouble();
		System.out.println("Digite o primeiro número");
		numero2 = leia.nextDouble();
		
		System.out.println("Raiz quadrada do numero 1: " + (Math.sqrt(numero1)));
		
		

	}

}
