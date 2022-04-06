
public class ContaEspecial extends Conta{
	
	private double limite;
	private double saldoLimite;

	public ContaEspecial(String nomeCliente, String numeroConta, double saldo, double limite) {
		super(nomeCliente, numeroConta, saldo);
		this.setLimite(limite);
		this.setSaldoLimite(limite);
	}

	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Limite cheque especial: R$ " + this.limite);
	}
	
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	// 200 - saldo
	// 200 - limite
	//  quero sacar 300(valor)
	
	// resultado 
	//saldo -> -100
	
	
	@Override
	public void sacar(double valor) {
		System.out.println("-------------------------------------------");
		if(this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Saque realizado com suceso");
			System.out.println("Seu novo saldo é de: " + this.getSaldo());
		}else if((this.getSaldo() + this.getSaldoLimite()) >= valor){
			this.setSaldoLimite(this.getLimite() - (valor - this.getSaldo()));
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Saque realizado com suceso");
			System.out.println("Seu novo saldo na conta é de: " + this.getSaldo());
			System.out.println("Seu novo saldo no limite é de: " + this.getSaldoLimite());
		}else {
			System.out.println("Seu saldo na conta mais o saldo do limite são insuficientes");
		}
		
	}

	@Override
	public void depositar(double valor) {
		
	}
	
	//limite ->1000  - aumentar ->2000
	
	//situação -> eu tinha um limite de 1000, porém eu já estava utilizando 200 desse limite, então
	//saldoLimite -> 800
	
	//saldoLimite -> novoValor - (limite - saldoLimite)
	//saldoLimite -> 1800
	
	public void ajustarLimite(double novoValor) {
		this.setSaldoLimite(novoValor - (this.getLimite() - this.getSaldoLimite()));
		
		this.setLimite(novoValor);
		
		System.out.println("Limite: " + this.getLimite());
		System.out.println("Saldo do Limite: " + this.getSaldoLimite());
		
	}

	public double getSaldoLimite() {
		return saldoLimite;
	}

	public void setSaldoLimite(double saldoLimite) {
		this.saldoLimite = saldoLimite;
	}

}
