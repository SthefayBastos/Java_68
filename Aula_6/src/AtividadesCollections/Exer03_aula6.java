package AtividadesCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exer03_aula6 {
	/*
	 * Escreva um programa Java para criar uma Collection Set de Objetos da Classe
	 * Wrapper Integer. O programa deverá solicitar ao usuário, que ele digite via
	 * teclado 10 valores inteiros não repetidos e adicione-os individualmente na
	 * Collection Set. Em seguida, faça o que se pede: Mostre na tela todos os
	 * elementos da Collection Set, utilizando a Classe Iterator.
	 */
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		Set<Integer> num = new HashSet<Integer>();
		

		
		System.out.println("Digite 10 números: ");
		for (int contador = 0; contador < 10; contador++) {

			num.add(leia.nextInt());
		}
		System.out.println("Estes são os números digitados: \n");
		
		Iterator<Integer> iNum = num.iterator();
		while(iNum.hasNext())
			System.out.println(iNum.next());
		
	}

}
