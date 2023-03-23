package Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex1Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int operacao;
		String nome;
		Queue <String> filabanco = new LinkedList<String>();

		Scanner leia = new Scanner(System.in);
		
		while(true) {
		
		System.out.println("**********************************************");
		System.out.println("*             Banco da GENTE                 *");
		System.out.println("**********************************************");
		System.out.println("*      1 - Adicionar cliente na fila         *");
		System.out.println("*      2 - Listar todos os clientes          *");
		System.out.println("*      3 - Retirar clientes da fila          *");
		System.out.println("*      0 - Sair                              *");
		System.out.println("**********************************************");
		operacao = leia.nextInt();
		
		if(operacao == 0) {
			System.out.println("Programa finalizado! ");
		}
		
		switch(operacao) {
		
		case 1:
			System.out.println("Digite o nome: ");
			leia.nextLine();
			nome = leia.nextLine();
			filabanco.add(nome);
			System.out.println(filabanco);
			System.out.println("\nCliente adicionado!");
			break;
		
		case 2: 
			System.out.println("Lista de Clientes na fila: "+filabanco);
			break;
			
		case 3:
			if(filabanco.size() == 0) {
				System.out.println("A fila está vazia!");
			}else {
				filabanco.remove();
				System.out.println("Fila: "+filabanco);
				System.out.println("\nO cliente foi chamado!");
				break;
			}
		default:
			System.out.println("\nOpção inválida!");
		}
		
		}
}
}
