
public class FuncMaoDeObra extends Funcionario{
	
	private String categoria = "Funcionário mão de obra";

	public FuncMaoDeObra(String nome, int idade, double salario, boolean temFilho) {
		super(nome, idade, salario, temFilho);
	}
	
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println("------- " + this.categoria + "--------");
		
	}
	
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	

}
