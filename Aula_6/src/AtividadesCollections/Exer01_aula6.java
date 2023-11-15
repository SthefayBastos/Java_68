package AtividadesCollections;

import java.util.ArrayList;
/*O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las 
 * individualmente no ArrayList. Em seguida, faça o que se pede:
 * Mostre na tela todas as cores que foram adicionadas; e em seguida mostre-as ordenadas.
*/
import java.util.Scanner;

public class Exer01_aula6 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
	
		ArrayList<String> cores = new ArrayList<String>();
		
		String nomeCores;
		
		
		
		System.out.println("Adicione 5 cores: ");
		for (int contador=0; contador < 5; contador++){
		nomeCores= leia.nextLine();
		cores.add (nomeCores);
		}
		
		System.out.println("Essas foram as cores digitadas: " + cores);
		
		cores.sort(null);
		System.out.println("Sua lista de cores de forma ordenada:" + cores);
	}
}
