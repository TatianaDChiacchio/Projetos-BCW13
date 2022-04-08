
public class PessoaFisica extends PessoaContribuinte {

	private double gastosComSaude;

	public PessoaFisica(String nome, double rendaAnual, double gastosComSaude) {
		super(nome, rendaAnual);
		this.setGastosComSaude(gastosComSaude);
	}

	@Override
	public double calcularImposto() {
		
		double imposto = (this.getRendaAnual() < 20000) ? this.getRendaAnual() * 0.15 : this.getRendaAnual() * 0.25;

//		if (this.getRendaAnual() < 20000) {
//			imposto = this.getRendaAnual() * 0.15;
//		}else {
//			imposto = this.getRendaAnual() * 0.25;
//		}

		if(this.getGastosComSaude() > 0) {
			imposto -= this.getGastosComSaude() * 0.5;
		}
		return imposto;
	}

	public double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

}
