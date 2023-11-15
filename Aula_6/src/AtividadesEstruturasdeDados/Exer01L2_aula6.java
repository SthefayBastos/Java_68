package AtividadesEstruturasdeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String,
 para organizar a ordem de chegada dos Clientes de um Banco.
O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
*1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
*2: Listar todos os Clientes na fila
*3: Chamar (retirar) uma pessoa da fila 
*0: O programa deve ser finalizado. 
 * */
public class Exer01L2_aula6 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		Queue<String> filaClien = new LinkedList<String>();
		String nome;
		int opcao = 1 ;
		while (opcao != 0) {
				
		System.out.println("----------------------------------------");	
		System.out.println("1- Adicionar Cliente na Fila            ");	
		System.out.println("2- Listar todos os Clientes             ");	
		System.out.println("3- Retirar todos os Clientes            ");	
		System.out.println("0- Sair\n                              ");	
		System.out.println("----------------------------------------");	
		System.out.println("Entre com a opção desejada: ");
		
		
		opcao = leia.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Digite o nome: ");
			leia.skip("\\R");
			nome = leia.nextLine();
			filaClien.add(nome);
			System.out.println("Cliente adicionado!");
			
			break;
			
		case 2: 
			if (filaClien.isEmpty()) {
				System.out.println("A fila está vazia!\n");
			}else {
				System.out.println("Clientes na fila: " + filaClien + "\n");
			}
			break;
		
		case 3:
			if (filaClien.isEmpty()) {
				System.out.println("A fila está vazia");
			} else {
				 nome = filaClien.remove();
			}
			 break;	
			
		case 0:
			System.out.println("Programa finalizado!");
			break;
			default:
				System.out.println("Opção inválida! ");
				}
			}		
		}
}
