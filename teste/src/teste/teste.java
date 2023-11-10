package teste;

import java.util.Scanner;

public class teste {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int idade;
		String doador, isAble;
		boolean primeiraD;
		
		System.out.println("Digite o Nome do doador: ");
		doador = leia.nextLine();
		System.out.println("Digite a Idade do doador: ");
		idade = leia.nextInt();
		System.out.println("Primeira doação de sangue? ");
		primeiraD = leia.nextBoolean();

		isAble = "está apto";
		
		if(idade < 18 || idade > 69) {
			isAble = "não está apto";
		} else if((idade >= 60 && idade <= 69) && (primeiraD == true)) {
			isAble = "não está apto";
		}
		
		System.out.printf("%s %s para doar sangue!", doador, isAble);
		
	}

}
