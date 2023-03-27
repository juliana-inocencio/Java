package POO;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente("Juliana","Inocencio", 28,1234567891,1994);
		PessoaFisica pessoa1 = new PessoaFisica("Juliana","Inocencio", 28,1234567891,1994,"R. José de Anchieta, n. 122");
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Juliana","Inocencio", 28,1234567891,1994,"22222222/000122");
		
		cliente1.visualizar();
		pessoa1.visualizar();
		pessoaJuridica.visualizar();
		
	}

}
