package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> listaCores = new ArrayList();
		int indice;
		
		Scanner leia = new Scanner(System.in);
		
		
		for(indice = 0; indice<5; indice++) {
			System.out.println("Digite uma cor: ");
			 String cores  = leia.nextLine();
			 listaCores.add(cores);
			 Collections.sort(listaCores);
			 
		}
		System.out.print("\nListar todas as cores: "+listaCores);
		System.out.print("\nOrdenar todas as cores: "+listaCores);
	}
}
