
public class Principal {

	public static void main(String[] args) {

		Gato g1 = new Gato("Mingau","Persa");
		Gato g2 = new Gato("Otto","Vira-lata");
		
		System.out.println("O nome do gato g1 é: " + g1.nome + " e sua raça é: " + g1.raca);
		System.out.println("O nome do gato g2 é: " + g2.nome + " e sua raça é: " + g2.raca);
		
		g1.setIdade(2);
		g2.setIdade(3);
		//g2.idade = 3;
		
		//System.out.println(g1.idade);
		g1.fazerAniversario();
		//System.out.println(g1.idade);
		
		System.out.println(g1.vacina);
		g1.vacinar("V2");
		System.out.printf("%s %s %s %d %n","O nome gato é ",g1.nome," e sua idade é: ", g1.getIdade());
		System.out.println("O gato " + g1.nome + " tomou a vacina " + g1.tipoVacina);
		
		System.out.println("*******************************");
		System.out.println(g1.getNome());
		//g1.nome = "Garfield";
		g1.setNome("Garfield");
		System.out.println(g1.getNome());
		
		g1.setIdade(-1);
		
		System.out.println("**********************************************************************");
		
		Produto p1 = new Produto("Ração","Purina",10,25.90,3);
		Produto p2 = new Produto("Areia","PipiCat",15,15.80,4);
		Produto p3 = new Produto("caminha","Hering",5,125.45,2);
		
		System.out.println(p1.getNome());
		System.out.println(p2.getNome());
		System.out.println(p3.getNome());
		
		System.out.println(p1.getEstoque());
		p1.vender(5);
		System.out.println(p1.getEstoque());
		p1.vender(4);
		System.out.println(p1.getEstoque());
		System.out.println(p1.verificarEstoque());
		p1.comprarMaisProduto(10);
		System.out.println(p1.verificarEstoque());
		
	}

}
