
public class FuncSupervisor extends Funcionario{
	
	private final double bonus = 1200;

	public FuncSupervisor(String nome, int idade, double salario, boolean temFilho) {
		super(nome, idade, salario, temFilho);
		super.categoria = "Funcionário Supervisor";
	}
	
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println("------- " + super.categoria + "--------");
	}
	
	public double valorSalarioMaisBonus() {
		return getSalario() + getBonus();
	}

	public double getBonus() {
		return bonus;
	}

}
