package Atividades;

import java.util.Scanner;

public class Exer03_aula5 {

	static Scanner leia = new Scanner (System.in);


	public static void main(String[] args) {
		int [][] matriz = new int [3][3];
		int somaP = 0, somaS = 0;
		String diagonalP = "" ,  diagonalS = "";
		for (int indiceI = 0; indiceI < matriz.length; indiceI ++ ) {
			for (int indiceJ = 0; indiceJ < matriz[indiceI].length; indiceJ ++ ) {
				System.out.println("Digite o número da posição: |" +(indiceI + 1) + "," + (indiceJ + 1) + "|");
				matriz [indiceI][indiceJ] =  leia.nextInt();
			}
		}
		//DiagonalPrincipal
		for (int indice = 0; indice < matriz.length; indice ++) {
			diagonalP += matriz[indice][indice] + " ";
			somaP += matriz[indice][indice];
			
			
		}
		//Diagonal Secundária
		for (int indice = 0; indice < matriz.length; indice ++) {
			diagonalS += matriz[indice][matriz.length - 1 - indice] + " ";
			somaS += matriz[indice][matriz.length - 1 - indice];
			
		}
		System.out.println("Elementos da Diagonal Principal: " + diagonalP);
		System.out.println(" Soma dos Elementos da Diagonal Principal: " + somaP);

		System.out.println("Elementos da Diagonal Secundária: " + diagonalS);
		System.out.println(" Soma dos Elementos da Diagonal Secundária: " + somaS);
	}

}
