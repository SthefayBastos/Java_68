package LiveCode;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		pilha.add ("Aline");
		pilha.add ("Pedro");
		pilha.add ("Vinicius");
		pilha.add ("Luiza");
		
		//push assim como add, adiciona item à pilha
		pilha.push ("Maria");
		
		System.out.println(pilha);
		
		//pop remove último item adicionado à pilha
		
		pilha.pop();
		
		System.out.println(pilha);
		
		System.out.println("O elemento que está no topo da pilha: " + pilha.peek());
	}

}
