package Collections;

import java.util.Scanner;
import java.util.Stack;

public class Ex2Pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> livros =  new Stack<String>();
		
		int opcao;
		
		Scanner leia = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("**********************************************");
			System.out.println("*             PILHA DE LIVROS                *");
			System.out.println("**********************************************");
			System.out.println("*      1 - Adicionar livro na pilha          *");
			System.out.println("*      2 - Listar todos od livros            *");
			System.out.println("*      3 - Retirar livro da pilha            *");
			System.out.println("*      0 - Sair                              *");
			System.out.println("**********************************************");
			opcao = leia.nextInt();
			
			if(opcao == 0) {
				System.out.println("Programa Finalizado");
			}
			
			switch (opcao) {
			
			case 1:
				System.out.println("Digite o nome: ");
				leia.nextLine();
				String livro = leia.nextLine();
				livros.push(livro);
				System.out.println("Pilha: "+livros);
				System.out.println("Livro adicionado!");
				break;
				
			case 2:
				System.out.println("Lista de livros na pilha: "+livros);
				break;
				
			case 3:
				if(livros.size() == 0) {
				System.out.println("A pilha está vazia! ");
				}else {
					livros.pop();
					System.out.println("Pilha: "+livros);
					System.out.println("Um livro foi retirado da pilha");
					break;
					
				}
			
			}
		
	}
	}
}
