
public class Produto {
	
	private String nome;
	private String marca;
	private int estoque;
	private double valor;
	private boolean status;
	final int estoqueMinimo;
	
	public Produto(String nome, String marca, int estoque, double valor, int estoqueMinino) {
		this.estoqueMinimo = estoqueMinino;
		this.nome = nome;
		this.marca = marca;
		this.estoque = estoque;
		this.valor = valor;
	}
	
	public void vender(int quantidade) {
		
		if (quantidade <= this.estoque) {
			this.estoque -= quantidade;
		}else {
			System.out.println("Não temos essa quantidade em estoque");
		}
		
	}
	
	public boolean verificarEstoque() {
		if (this.estoque >= this.estoqueMinimo) {
			return true;
		}else return false;
		
	}
	
	public void comprarMaisProduto(int quantidade) {
		
		this.estoque += quantidade;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
	
	
	

}
