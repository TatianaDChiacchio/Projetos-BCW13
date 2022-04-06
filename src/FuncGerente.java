
public class FuncGerente extends Funcionario{
	
	private final double horasExtras = 50.0;
	private int quantHorasExtras;

	public FuncGerente(String nome, int idade, double salario, boolean temFilho) {
		super(nome, idade, salario, temFilho);
		super.categoria = "Funcionário Gerente";
	}

	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println("------- " + super.categoria + "--------");
	}
	
	public double valorExtra() {
		return this.quantHorasExtras * this.horasExtras;
	}
	
	public double salarioMaisHorasExtras() {
		return getSalario() + valorExtra();
	}
	
	public int getQuantHorasExtras() {
		return quantHorasExtras;
	}

	public void setQuantHorasExtras(int quantHorasExtras) {
		this.quantHorasExtras = quantHorasExtras;
	}

	public double getHorasExtras() {
		return horasExtras;
	}
	
	

}
