package aula_2;

import java.util.Scanner;

public class Operadores {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int numero1= 10, numero2=20;
		String valor1 = "2", valor2 = "3"; 
		System.out.println("A soma entre as variáveis numero1 e numero2 é igual a : " + (numero1 + numero2));
		System.out.println("A soma das entre as variáveis valor1 e valor2 é: " +(valor1+valor2));
		
		String nome = "Sthefany";
		int idade = 24;
		float media = 3.89535f;
		
		int tamanho;
		
		System.out.println("A soma das variáveis numero1 e numero2 é igual a : " + (numero1+numero2));
		System.out.println("A soma das variáveis valor1 e valor 2 é igual a: " + (valor1+valor2));
		
		System.out.println("Meu nome é " + nome + "e eu tenho " + idade + "anos." );
		
		System.out.println("A média final de %s é %.2f, nome, media");
		
		System.out.println("\n Digite o tamanho ");
		tamanho = leia.nextInt();
		
		System.out.println("O valor digitado foi " + tamanho);
		
	}

}
