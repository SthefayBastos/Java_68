package AtividadesCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exer02_aula6 {
	
	
/*Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe Wrapper Integer, 
 * inicializada com 10 valores inteiros.
 * O programa deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro e caso 
 * ele seja encontrado no ArrayList, exiba na tela a posição deste número na Collection.
 *  Caso o número não seja encontrado,ele deverá exibir na tela a 
 *  mensagem: O número NN não foi encontrado! */
	
	static Scanner  leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> listaNum = new ArrayList<>(Arrays.asList(2,5,4,3,9,8,7,1,6,10));
		
		int leiaNum;
		
		System.out.println("Digite um número para saber se ele pertence à lista: ");
		 
		leiaNum = leia.nextInt();
		
		 if(listaNum.contains(leiaNum)) {
			 
			 System.out.println("O número " + leiaNum + " pertence à lista e está na posição:  " + 
		 listaNum.indexOf(leiaNum));
		 
		 
		 }else{
			 System.out.println("O número " + leiaNum + " não pertece à lista!");
		 }

	}	
		
}
