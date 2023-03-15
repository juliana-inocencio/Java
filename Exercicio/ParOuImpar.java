package JavaIntrodução;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero,conta;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um número: ");
		numero = leia.nextInt();
		
		conta = numero % 2;
		
		if (conta == 0 && numero > 0){
			System.out.printf("\nO Número %d é par e positivo!",numero);
		}else if (conta == 0 && numero < 0) {
			System.out.printf("\nO número é %d é par e negativo!",numero);
		}else if (conta != 0 && numero > 0) {
			System.out.printf("\nO número é %d é ímpar e positivo!",numero);
		}else if (conta != 0 && numero < 0){
			System.out.printf("\nO número é %d ímpar e negativo!",numero);
		}
			
	}
}
