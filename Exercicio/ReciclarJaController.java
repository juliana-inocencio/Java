package controller;


import java.util.ArrayList;
import java.util.Scanner;

import doacao.*;
import model.Pessoa;
import repository.ReciclarJaRepository;


public class ReciclarJaController extends Pessoa implements ReciclarJaRepository  {
	
	
	//IDE solicitou para acrescentar o contrutor 
	public ReciclarJaController(String nome, String cpf, float saldo) {
		super(nome, cpf, saldo);
		

	}

	Scanner leia = new Scanner (System.in);
	campodoacao doacao =  new campodoacao();
	
	
	private ArrayList<Pessoa> listaClientes = new ArrayList<Pessoa>();
	int opcao;
	String cpf,nome;
	
	//metodo criado para validar o cpf no metodo lerCpf
	public boolean validarCpf() {
		if (cpf.length() != 11) {
			System.out.println("\nCPF inválido!!");
			return false;
		}
		return true;
	}
	//ler o cpf para validar 
	public void lerCpf() {
		cpf = leia.nextLine();
		while(validarCpf() == false) { 
			System.out.println("Opção inválida. Digite novamente: ");
			cpf = leia.nextLine();
			
		}
	}
	
	//criar objeto - Não estamos conseguindo fazer o objeto para cadastrar
	//ainda falta criar a arraylist com os clientes de onde vai ser puxado o cpf e o saldo
	//ver se já não foi feito essa parte da soma do saldo presente no objeto com o saldo da operação 
	//atual
	@Override
	public void cadastrar(String nome,  String cpf, float saldo) {
		Pessoa nome = new Pessoa(String nome,  String cpf, float saldo) {
		
		}
	}
	
	@Override //Localizar o CPF na ArrayList listaClientes
	public void procurarPorCpf(String cpf) {
		var pessoa = buscarNaCollection(cpf);
		
		if(pessoa != null) {
			pessoa.visualizar();
		//colocando aqui o uma mensagem de agradecimento por ter salvo os créditos
			System.out.println("\nCadastro Localizado. Seu saldo foi creditado com sucesso! \nObrigada por usar nosso sistema!");
			//sair do código após esse if 
		} else {
			System.out.println("============================================================================================");
			System.out.println("||                                                                                        ||");                                                                                    
			System.out.println("||                            O CPF não possui cadastro!                                  ||"); 
			System.out.println("||           Para creditar, precisamos cadastrar seu CPF, deseja continuar?               ||");
			System.out.println("||                               (1) Sim    |    (2) Não                                  ||");
			System.out.println("||                                                                                        ||");
			System.out.println("============================================================================================");
			//lendo a opção
			opcao = leia.nextInt ();
		}
		
		switch (opcao) {
		//caso ele queira cadastrar: linkar aqui a parte de cadastro:
		case 1:
			//Gustavo vai encaixar a parte aqui 
			break;
		//caso ele diga que não quer cadastrar:
		case 2:
		//vai aparecer a mensagem avisando que os valores vão ser doados e vai ler a resposta
			doacao.msgdoacao();
		//se a resposta for positiva ele vai doar e aparecer a mensagem de agradecimento
			doacao.doar(opcao);
			break;
			//sair do código após esse case
		}
	}

	@Override // Método para puxar o cadastro \*
	/*
	public void cadastrar(Pessoa pessoa) {
		listaClientes.add(pessoa);
		System.out.println("\n Cadastro feito com sucesso!");
		
	}
*/
	@Override // Listar todos os clientes
	public void listarTodas() {
		for (var pessoa: listaClientes) {
			pessoa.visualizar();
		}
		
	}

	// Buscar cliente na ArrayList ListaClientes
	public Pessoa buscarNaCollection (String cpf) {
		for (var pessoa:listaClientes) {
			if (pessoa.getCpf() == cpf) {
				return pessoa;		
			}		
		}
		return null;
	 }
	
}