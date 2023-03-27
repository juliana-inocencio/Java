package POO;

public class PessoaJuridica extends Cliente {

	private String cnpj;

	public PessoaJuridica(String nome, String sobrenome, int idade, int cpf, int anoNascimento, String cnpj) {
		super(nome, sobrenome, idade, cpf, anoNascimento);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void visualizar() {
		System.out.println("\nNome: "+getNome()+"\nCNPJ: "+cnpj);
	}
	
	
}
