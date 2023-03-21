package Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> listadenumeros = new HashSet<Integer>();
		int indice;
		
		Scanner leia = new Scanner(System.in);
		
		for(indice = 0; indice<10; indice++) {
			System.out.println("Digite um número(não colocar números repetidos): ");
			 int usuario  = leia.nextInt();
			 listadenumeros.add(usuario);
			
		}
		
		System.out.println(listadenumeros);
	}

}
