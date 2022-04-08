
public class PessoaJuridica extends PessoaContribuinte {

	private int numeroFuncionarios;

	public PessoaJuridica(String nome, double rendaAnual, int numeroFuncinarios) {
		super(nome, rendaAnual);
		this.setNumeroFuncionarios(numeroFuncinarios);
	}

	@Override
	public double calcularImposto() {

		double imposto = (this.getNumeroFuncionarios() > 10) ? this.getRendaAnual() * 0.14
				: this.getRendaAnual() * 0.16;
		return imposto;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

}
