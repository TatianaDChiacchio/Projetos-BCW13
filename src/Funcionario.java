
public class Funcionario {
	
	private String nome;
	private int idade;
	private double salario;
	private boolean temFilho;
	private boolean ativo;
	
	public Funcionario(String nome, int idade, double salario, boolean temFilho) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.temFilho = temFilho;
		this.setAtivo(true);
		
	}
	
	public void mostrarDados() {
		
		System.out.println("--------------------------------");
		System.out.println("Nome do funcionário: " + this.nome);
		System.out.println("Idade do funcinário: " + this.idade);
		System.out.println("Salário do funcioário: R$ " + this.salario);
		
	}
	
	public void informarFilho() {
		
	}
	
	public void baterPonto() {
		
		System.out.println("Horas trabalhadas - ok");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public boolean isTemFilho() {
		return temFilho;
	}

	public void setTemFilho(boolean temFilho) {
		this.temFilho = temFilho;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
	

}
