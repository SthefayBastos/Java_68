package AtividadesEstruturasdeDados;

import java.util.Scanner;
import java.util.Stack;

public class Exer02L2_aula6 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		Stack<String> pilhaLivros = new Stack<String>();
		String nomeLivro;
		int opcao = 1;
		while (opcao != 0) {

			System.out.println("----------------------------------------");
			System.out.println("1- Adicionar novo livro na pilha        ");
			System.out.println("2- Listar todos os livros               ");
			System.out.println("3- Retirar livros da pilha              ");
			System.out.println("0- Sair\n                               ");
			System.out.println("----------------------------------------");
			System.out.println("Entre com a opção desejada: ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome: ");
				leia.skip("\\R");
				nomeLivro = leia.nextLine();
				pilhaLivros.add(nomeLivro);
				System.out.println("Livro adicionado!");

				break;

			case 2:
				if (pilhaLivros.isEmpty()) {
					System.out.println("A pilha está vazia!\n");
				} else {
					System.out.println("Livros na pilha: \n" + pilhaLivros + "\n");
				}
				break;

			case 3:
				if (pilhaLivros.isEmpty()) {
					System.out.println("A pilha está vazia");
				} else {
					nomeLivro = pilhaLivros.pop();
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
