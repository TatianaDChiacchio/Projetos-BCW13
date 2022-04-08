
public class Financiamento {

	private double valorTotal;
	private double valorEntrada;
	private Integer parcelas;
	
	public Financiamento(double valorTotal, double valorEntrada, Integer parcelas) {
		
		if(valorEntrada < valorTotal * 0.2) {
			throw new RuntimeException("A entrada deve ser de, no mínimo, 20% do valor total");
		}else if(parcelas <5) {
			throw new RuntimeException("O número de parcelas deve ser, no mínino de 5");
		}
		
		this.valorTotal = valorTotal;
		this.valorEntrada = valorEntrada;
		this.parcelas = parcelas;
	}
	
	public double prestacao() {
		return (this.getValorTotal() - this.getValorEntrada()) /  this.getParcelas();
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double getValorEntrada() {
		return valorEntrada;
	}

	public void setValorEntrada(double valorEntrada) {
		this.valorEntrada = valorEntrada;
	}

	public Integer getParcelas() {
		return parcelas;
	}

	public void setParcelas(Integer parcelar) {
		this.parcelas = parcelar;
	}
	
	
	
	
}
