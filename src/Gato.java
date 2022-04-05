
public class Gato {
	
	public String nome;
	public String raca;
	private int idade;
		
	public boolean vacina;
	public String tipoVacina;
	
	public Gato(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
	}
	
	public void fazerAniversario() {
		this.idade++;
	}
	
	public void vacinar(String x) {
		this.tipoVacina = x;
		this.vacina = true;
	}

	
	//get - recuperar dados
	//set - modficar dados
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade > 0) {
			this.idade = idade;	
		}else {
			System.out.println("Não existe idade negativa");
		}
		
	}

	public boolean isVacina() {
		return vacina;
	}

	public void setVacina(boolean vacina) {
		this.vacina = vacina;
	}

	public String getTipoVacina() {
		return tipoVacina;
	}

	public void setTipoVacina(String tipoVacina) {
		this.tipoVacina = tipoVacina;
	}
	
	
	
	

}
