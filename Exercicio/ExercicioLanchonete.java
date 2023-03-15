package JavaIntrodução;

import java.util.Scanner;

public class ExercicioLanchonete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao, quantidade;
		float conta1,conta2,conta3,conta4,conta5,conta6;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nCódigo do Produto: ");
		opcao = leia.nextInt();
		
		System.out.println("Qual a quantidade?");
		quantidade = leia.nextInt();
		
		conta1 = quantidade * 10;
		conta2 = quantidade * 15;
		conta3 = quantidade * 18;
		conta4 = quantidade * 12;
		conta5 = quantidade * 8;
		conta6 = quantidade * 13;
		
		switch(opcao) {
		
		case 1:
			System.out.printf("Produto: Cachorro quente \nValor total: R$ %.2f ",conta1);
			break;
		case 2:
			System.out.printf("Produto: X-Salada \nValor total: R$ %.2f",conta2);
			break;
		case 3:
			System.out.printf("Produto: X-Bacon \nValor total: R$ %.2f",conta3);
			break;
		case 4:
			System.out.printf("Produto: Bauru \nValor total: R$ %.2f",conta4);
			break;
		case 5:
			System.out.printf("Produto: Refrigerante \nValor total: R$ %.2f",conta5);
			break;
		case 6:
			System.out.printf("Produto: Suco de laranja \nValor total: R$ %.2f",conta6);
			break;
			default:
				System.out.println("\nOpção Inválida!!!");
			
		}	
	}

}
