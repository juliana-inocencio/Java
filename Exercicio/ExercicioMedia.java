package JavaIntrodução;

import java.util.Scanner;

public class ExercicioMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1, nota2, nota3, nota4, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Nota 1: ");
		nota1 = leia.nextFloat();
		System.out.println("Nota 2: ");
		nota2 = leia.nextFloat();
		System.out.println("Nota 3: ");
		nota3 = leia.nextFloat();
		System.out.println("Nota 4: ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
				
		System.out.printf("Média final: %.1f",media);
		
				
			
		
		
	}

}
