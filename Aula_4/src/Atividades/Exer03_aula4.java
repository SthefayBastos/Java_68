package Atividades;

/*Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), 
 * via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e 
 * o total de pessoas cuja idade seja maior que 50 anos.
 * A leitura dos dados deve ser finalizada ao digitar uma idade negativa.*/
import java.util.Scanner;

public class Exer03_aula4 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade = 0, totalPesMen21 = 0, totalPesMaior50 = 0;

		while (true) {
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			
			if (idade < 0) {
				break;
			}
			
			if (idade < 21) {
				totalPesMen21++;
				
			} else if (idade > 50) {
				totalPesMaior50++;

			}
			System.out.println("Total de pessoas com menos de 21 anos: " + totalPesMen21);
			System.out.println("Total de pessoas com mais de 50 anos: " + totalPesMaior50);
		}
		
	}
}
