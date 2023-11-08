package media4notas;

import java.util.Scanner;

public class Media4Notas {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		float nota1,nota2,nota3,nota4;
		
		System.out.println("Abaixo, digite suas 4 notas para obter a média: ");
		 nota1 = leia.nextFloat();
		 nota2 = leia.nextFloat();
		 nota3 = leia.nextFloat();
		 nota4 = leia.nextFloat();
		System.out.println("A sua média é: " + (nota1+nota2+nota3+nota4)/4 );
	}

}
