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
		
		//Condição para realizar a divisão
		System.out.println("Soma: " + (numero1+numero2));
		System.out.println("Subtração: " + (numero1-numero2));
		System.out.println("Multiplicação: " + (numero1*numero2));
		
		if (numero2 > 0) {
			System.out.println("Divisão: " + (numero1/numero2));
		}else {
			System.out.println("Não existe divisão por zero!");
		}
		/* Por aqui eu consigo
		 * escrever mais
		 * de uma linha de comentário
		 **/
		System.out.println("Módulo do numero1 (Resto da divisão: " + (numero1%2));
		System.out.println("Módulo do número2 (Resto da divisão: " + (numero2%2));
		
		System.out.println("Potência do numero1 pelo numero 2: " + Math.pow(numero1, numero2));
		System.out.println("Raiz quadrada do numero 1: " + (Math.sqrt(numero1)));
		
		

	}

}
