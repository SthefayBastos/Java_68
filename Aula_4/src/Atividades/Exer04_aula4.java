package Atividades;

import java.util.Scanner;

public class Exer04_aula4 {
	
	static Scanner leia = new Scanner (System.in);

	public static void main(String[] args) {
		int idade, gen, pessoaDev, devBack = 0 , devFront = 0, devFull = 0,devMobile = 0, 
		totalPes = 0, somaIdade = 0;
		
		float media = 0.00f;
		String continua = "S";
		
		
		while(continua.equalsIgnoreCase("S")) {
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			
			do {
				
					System.out.println("Digite o Gênero:");
					System.out.println("| 1- Mulher Cis  \n|");
					System.out.println("| 2- Homem Cis   \n|");
					System.out.println("| 3- Não binário \n|");
					System.out.println("| 4- Mulher Trans\n|");
					System.out.println("| 5- Homem Trans \n|");
					System.out.println("| 6- Outros      \n|");
					
					gen = leia.nextInt();
					if ( gen < 1 || gen > 6)
						System.out.println("Digite o número correspondente ao seu gênero apresentado no menu anterior");
			}while (gen < 1 || gen >6);
			do {
				System.out.println("Digite o tipo de desenvolvedor: ");
				System.out.println("| 1- BackEnd \n|");
				System.out.println("| 2- FrontEnd\n|");
				System.out.println("| 3- Mobile  \n|");
				System.out.println("| 4-FullStack\n|");
				pessoaDev = leia.nextInt();
				
				if(pessoaDev < 1 || pessoaDev< 4)
					System.out.println("Digite o número correspondente ao seu gênero apresentado no menu anterior");
				
			}while(pessoaDev < 1 || pessoaDev > 6);
			
			if (pessoaDev == 1)
				devBack++;
			
			if(pessoaDev == 2 && (gen == 1 || gen == 4))
				devFront++;
			
			if(pessoaDev == 3 && (gen ==2 || gen == 5)&& idade > 40)
				devMobile++;
			
			if (pessoaDev == 4 && gen == 3 && idade < 30)
				devFull++;
			
			totalPes++;
			somaIdade++;
			media = (float)somaIdade/totalPes;
			
			System.out.println("Deseja continuar? \n");
			System.out.println("Digite S ou N");
			leia.skip("\\R");
			continua = leia.nextLine().toUpperCase();
		}
		System.out.println("Total de pessoas desenvolvedoras Backend: \n" + devBack);
		System.out.println("Total de pessoas desenvolvedoras Frontend Mulheres Cis e Trans: \n" + devFront);
		System.out.println("Total de pessoas desenvolvedoras Mobile Homens CIs e Trans com idade acima de 40 anos: \n" + devMobile);
		System.out.println("Total de pessoas desenvolvedoras FullStack Não Binários com idade inferior a 30 anos: \n" + devFull);
		System.out.println("Total de pessoas que responderam a pesquisa: \n" + totalPes);
		System.out.printf("Média de idade das pessoas desenvolvedoras que responderam a pesquisa: %.2f \n", media);
	
	}

}
