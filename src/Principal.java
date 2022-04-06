
public class Principal {

	public static void main(String[] args) {
		
		//Funcionario f1 = new Funcionario("ssss",23,1200,false);
		
		FuncMaoDeObra mb1 = new FuncMaoDeObra("Ricardo", 34, 2300, true);
		FuncMaoDeObra mb2 = new FuncMaoDeObra("Alana", 24, 2000, false);

		FuncGerente g1 = new FuncGerente("Bruna", 46, 4350, true);

		FuncSupervisor s1 = new FuncSupervisor("Joaquim", 56, 5000, false);

		mb1.mostrarDados();
		mb2.mostrarDados();
		g1.mostrarDados();
		s1.mostrarDados();

		g1.setQuantHorasExtras(5);
		System.out.println(
				"O gerente " + g1.getNome() + " tem a receber " + g1.valorExtra() + " por horas extras trabalhadas.");
		System.out.println("O seu salário acrescido das horas extras vai ser de: " + g1.salarioMaisHorasExtras());

		System.out.println("O salário do Supervisor " + s1.getNome() + " acrescido do bônus vai ser: "
				+ s1.valorSalarioMaisBonus());
	}
}
