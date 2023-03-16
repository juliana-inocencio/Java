package JavaIntrodução;

import java.util.Scanner;

public class ExercicioMultiplosde3e5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2,x;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo número do intervalo: ");
		num2 = leia.nextInt();
		
		if (num1>num2) {
			System.out.println("\nIntervalo inválido");
		}else {
			System.out.printf("\nNo intervalo entre %d e %d:  ",num1,num2);
			for (x=num1;x<=num2;x++) {
				if(x % 5 ==0 && x % 3 ==0) {
					System.out.printf("\n%d é múltiplo de 3 e 5",x);
				}
				
			}
			
			
		}
		
		
	}

}
