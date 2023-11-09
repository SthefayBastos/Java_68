package ExerciciosPraticos;
	import java.util.Scanner;
public class Exer03_aula3 {

			
			static Scanner leia = new Scanner(System.in);
			public static void main(String[] args) {
				
				int codigoCarCol;
				double salarioAnt, novoSal, reajusteSal;
				String nomeCarg, cargo;
				
				System.out.println("Nome do colaborador: ");
				nomeCarg = leia.nextLine();
				System.out.println("Cargo: ");
				codigoCarCol = leia.nextInt();
				System.out.println("Salário: R$ ");
				salarioAnt = leia.nextDouble();

				switch(codigoCarCol) {
					case 1:
						reajusteSal = 0.1;
						cargo = "Gerente";
						break;
					case 2:
						reajusteSal = 0.07;
						cargo = "Vendedor";
						break;
					case 3:
						reajusteSal = 0.09;
						cargo = "Supervisor";
						break;
					case 4:
						reajusteSal = 0.06;
						cargo = "Motorista";
						break;
					case 5:
						reajusteSal = 0.05;
						cargo = "Estoquista";
						break;
					case 6:
						reajusteSal = 0.08;
						cargo = "Técnico de TI";
						break;
					default:
						reajusteSal = 0;
						cargo = "Cargo Inválido";
				}
				
				novoSal = (salarioAnt + (salarioAnt*reajusteSal));
				
				System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
				System.out.printf("Nome do colaborador: %s\nCargo: %s\nSalário: R$ %.2f\n", nomeCarg, cargo, novoSal);
				System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
				
	}

}
