package ExerciciosPraticos;

import java.util.Scanner;

public class Exer07_aula3 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		String nome;
		boolean primeiraDoac;
		int idade;
		
		
		System.out.println("Digite o seu nome:");
		nome = leia.nextLine();
		
		System.out.println("Digite a sua idade: ");
		idade =  leia.nextInt();
		//criação if para questionar somente se idade for >= 60 && <69
		if (idade>=60 && idade < 69) {
		System.out.println("É sua primeira doação de sangue?");
		primeiraDoac = leia.nextBoolean();
		
		if ((idade <18 || idade >69) || (idade >=60 && primeiraDoac == true)) {
			System.out.printf("%s não está apto", nome);
			
		}
		}
		System.out.printf("%s está apto(a) para doar sangue!", nome);
	}
}
