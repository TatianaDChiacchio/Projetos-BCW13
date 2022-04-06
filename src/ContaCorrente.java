
public class ContaCorrente extends Conta {

	public ContaCorrente(String nomeCliente, String numeroConta, double saldo) {
		super(nomeCliente, numeroConta, saldo);
	}

	@Override
	public void sacar(double valor) {
		
//		if(valor <= this.getSaldo()) {
//			this.saldo -= valor;
//		}else {
//			System.out.println("Saldo insuficiente para esse saque!");
//		}
		System.out.println("-------------------------------------------");
		if(valor <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor);
			
			System.out.println("Saque realizado com suceso");
			System.out.println("Seu novo saldo é de: " + this.getSaldo());
		}else {
			System.out.println("Saldo insuficiente para esse saque!");
		}
		
	}

	@Override
	public void depositar(double valor) {
		
	}

}
