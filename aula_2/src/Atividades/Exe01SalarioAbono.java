package Atividades;

import java.util.Scanner;

public class Exe01SalarioAbono {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		float salario, abono;
		
		System.out.println("Digite seu salário: ");
		salario = leia.nextFloat();
		System.out.println("Digite o valor de abono: ");
		abono = leia.nextFloat();
		System.out.println("O valor do novo salário é: " + (salario+abono));
				
	}

}
