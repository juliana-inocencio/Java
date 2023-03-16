package JavaIntrodução;

import java.util.Scanner;

public class ExercicioNumeroPositivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, somarPositivos = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Entre com um número: ");
			numero = leia.nextInt();
			if(numero>0) {
				somarPositivos = somarPositivos + numero;		
			}
			
		}while(numero!=0);
				
		System.out.printf("\nA soma dos positivos é: %d",somarPositivos);
	}

}
