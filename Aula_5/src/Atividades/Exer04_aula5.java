package Atividades;

import java.util.Scanner;

public class Exer04_aula5 {
 /*Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4 bimestres de um ano. 
  * As 4 notas de cada participante serão armazenadas em uma linha de uma matriz de números reais, 
  * logo cada linha da matriz serão as notas de um participante. 
  * Em um vetor de números reais, armazene as médias de cada participante e exiba as médias de cada um na tela.
  */	
	
	static Scanner leia = new Scanner (System.in);

	public static void main(String[] args) {
		
		float [][] notas = new float [10][4];
		float [] medias = new float [10];
		float soma = 0.0f;
		
		for (int indiceI = 0; indiceI < notas.length; indiceI ++ ) {
			for (int indiceJ = 0; indiceJ < notas[indiceI].length; indiceJ ++ ) {
				System.out.println("Digite a " +(indiceJ + 1) + "º nota do participante " + (indiceI + 1) + ": ");
				notas [indiceI][indiceJ] =  leia.nextFloat();
			}
		}
		for (int indiceI = 0; indiceI < notas.length; indiceI ++ ) {
			for (int indiceJ = 0; indiceJ < notas[indiceI].length; indiceJ ++ ) {
				 soma += notas [indiceI][indiceJ];
			}
			medias [indiceI] =  soma / notas[indiceI].length;
			soma = 0.0f;
		}
		 for (int indice = 0; indice < medias.length; indice ++)
			 System.out.println("\nMédia do participante " + (indice + 1) + ": " + medias[indice]);
	}

}
