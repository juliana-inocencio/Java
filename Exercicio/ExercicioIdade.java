package JavaIntrodução;

import java.util.Scanner;

public class ExercicioIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade, contMenores = 0, contMaiores = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		while(idade > 0) {
			if(idade < 21) {
				contMenores++;
			}else if(idade > 50) {
				contMaiores++;
			}
			
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
		}	
		System.out.println("\nTotal de pessoas menores de 21 anos: "+contMenores);
		System.out.println("\nTotal de pessoas maiores de 50 anos: "+contMaiores);	
	}

}
