package JavaIntrodução;

import java.util.Scanner;

public class ExercicioVetores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num [] = new int[10];
		float media, somar = 0;
		int indice;
		
		Scanner leia = new Scanner(System.in);
		
		for(indice = 0; indice < 10; indice++) {
			System.out.println("Digite o número: ");
			num[indice] =leia.nextInt();
			somar = somar + num[indice];
		}
		
		System.out.println("\nElementos nos índices ímpares: ");
	
		for(indice = 0; indice < 10; indice++) {
			if(indice % 2 != 0) {
				System.out.printf(" %d",num[indice]);
			}
		}
		
		System.out.println("\nElementos pares: ");
		
		for(indice = 0; indice < 10; indice++) {
			if(num[indice] % 2 == 0) {
				System.out.printf(" %d",num[indice]);	
	}
		}
		
		media = somar/10;
		System.out.println("\nSoma: "+somar);
		System.out.println("\nMédia: "+media);
	}
}