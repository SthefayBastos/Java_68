package salarioliqui;

import java.util.Scanner;

public class SalarioLiquido {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		float salariob,adicNotur,horaEx,desc,salarioLiq;
		
		System.out.println("Precisamos saber as seguintes informações: ");
		System.out.println("Salário Bruto: ");
		salariob = leia.nextFloat();
		System.out.println("Valor de recebido de adicional noturno: ");
		adicNotur = leia.nextFloat();
		System.out.println("Valor a receber de Horas Extras: ");
		horaEx = leia.nextFloat();
		System.out.println("Digite o valor de desconto: ");
		desc = leia.nextFloat();
		salarioLiq = salariob + adicNotur + (horaEx * 5) - desc ;
		System.out.println("O seu salário líquido será: " + salarioLiq);

	}

}
