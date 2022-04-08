
public class ContaBancaria {
	private Integer numeroConta;
	private String titular;
	private double saldo;
	private double limiteSaque;

	public ContaBancaria(Integer numeroConta, String titular, double saldo, double limiteSaque) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque; 
	}

	public void sacar(double valor) {
		validarSaque(valor);
		this.setSaldo(this.getSaldo() - valor);
		
	}

	public void validarSaque(double valor) {
		if (valor > this.getLimiteSaque() && valor > this.getSaldo()) {
			throw new RuntimeException(
					"Erro de saque: o valor excede o limite de saque e você não tem saldo suficiente");
		}
		if (valor > this.getSaldo()) {
			throw new RuntimeException("Erro de saque: o valor excede o saldo");
		}
		if (valor > this.getLimiteSaque()) {
			throw new RuntimeException(
					"Erro de saque: o valor excede o limite de saque");
		}
	}

	public void depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

}
