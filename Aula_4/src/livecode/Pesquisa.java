package livecode;

import java.util.Scanner;

public class Pesquisa {
	 static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

			int idade, esporte, futebol = 0,voleiM18 = 0, basqueteMen18 = 0 , outros = 0;
			String continua = "S";
			
			while(continua.equalsIgnoreCase("s")) {
				
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		do {
		System.out.println("Digite seu esporte favorito:(1-Fut / 2-Vol / 3-Basq / 4-Outros )");
		esporte = leia.nextInt();
		
		if (esporte < 1 || esporte >4)
			System.out.println("Digite um número equivalente ao esporte escolhido:1-Fut / 2-Vol / 3-Basq / 4-Outros ");
		} while(esporte < 1 || esporte >4);
				//Quantas pessoas gostam de futebol
		if (esporte == 1)
			futebol ++;
				
				//Quantas pessoas gostam de volei e são maiores de 18 anos
		if (esporte == 2 && idade > 18)
			voleiM18 ++;
				//Quantas pessoas gostam de basquete e são menires de 18 anos
		if (esporte == 3 && idade < 18)
			basqueteMen18 ++;
				//Quantas pessoas gostam de outros esportes
		if (esporte == 4 )
			outros ++;
			
		System.out.println("Deseja continuar? (S/N)? ");
			leia.skip("\\R");
			continua = leia.nextLine().toUpperCase();
			}

			System.out.println("Total de pessoas que gostam de Futebol: " + futebol);
			System.out.println("Total de pessoas que gostam de Vôlei e são maiores de 18 anos: " + voleiM18);
			System.out.println("Total de pessoas que gostam de Basquete e são menores de 18 anos: " + basqueteMen18);
			System.out.println("Total de pessoas que gostam de Outros esportes: " + outros);

	}

}
