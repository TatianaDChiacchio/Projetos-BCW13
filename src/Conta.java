
public abstract class Conta implements ContaInterface{
// o modificador de acesso abstract proíbe que a classe seja instanciada
// normalmente utiizamos esse modificar de acesso em superclasses
	private String nomeCliente;
	private String numeroConta;
	private double saldo;
	
	
	public Conta(String nomeCliente, String numeroConta, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}


	public void mostrarDados() {
		
		System.out.println("--------------------------------");
		System.out.println("Nome do correntista: " + this.nomeCliente);
		System.out.println("Número Conta: " + this.numeroConta);
		System.out.println("Saldo da Conta: R$ " + this.saldo);
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public String getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
