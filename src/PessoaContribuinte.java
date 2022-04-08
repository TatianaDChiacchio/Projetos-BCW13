
public abstract class PessoaContribuinte {
	
	private String nome;
	private double rendaAnual;
	
	
	public PessoaContribuinte(String nome, double rendaAnual) {
		super();
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public abstract double calcularImposto();

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getRendaAnual() {
		return rendaAnual;
	}


	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	

}
