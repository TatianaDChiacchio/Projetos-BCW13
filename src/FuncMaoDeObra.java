
public class FuncMaoDeObra extends Funcionario {
	
	

	public FuncMaoDeObra(String nome, int idade, double salario, boolean temFilho) {
		super(nome, idade, salario, temFilho);
		super.categoria = "Funcionário mão de obra";
	}
	
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println("------- " + super.categoria + "--------");
	}
	
	
	
	

}
