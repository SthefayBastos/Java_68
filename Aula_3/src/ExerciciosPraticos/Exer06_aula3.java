package ExerciciosPraticos;

import java.util.Scanner;


public class Exer06_aula3 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		float valor, saldo = 1000.00f;
		int operacao;
		
		System.out.println("1- Saldo");
		System.out.println("2- Saque");
		System.out.println("3- Depósito");
		
		operacao= leia.nextInt();
		
		switch(operacao) {
		case 1:
			System.out.println("Saldo na conta é: " + saldo);
				break;
		case 2: 
			System.out.println("Informe  valor do saque: ");
			valor = leia.nextFloat();
			if (saldo>=valor)	
				System.out.println("O novo saldo da conta é" + (saldo - valor));
			else
				System.out.println("Saldo Insuficiente!");
				break;
		case 3: 
			System.out.println("Informe o valor do depósito: ");
			valor = leia.nextFloat();
			
			System.out.println("O novo saldo da conta é " + (saldo+valor));
			break;
			default:
		}
				
				

	}

}
