package LiveCode;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList <String>();
		
		fila.add ("Aline");
		fila.add ("Pedro");
		fila.add ("Vinicius");
		fila.add ("Luiza");
		fila.add ("Maria");
		
		
		System.out.println(fila);
		fila.remove();
		System.out.println(fila);
		
		fila.peek();
		
		System.out.println(fila);
		System.out.println(fila.peek());
		System.out.println(fila.poll());
System.out.println("A maria está na fila? " + fila.contains("Maria"));
System.out.println("Total de elementos: " + fila.size());
		int contador =0;
for(var pessoa : fila) {
	contador ++;
	if (pessoa.equalsIgnoreCase("Maria"))
		System.out.println("Posição: " + contador);
}
	}

}
