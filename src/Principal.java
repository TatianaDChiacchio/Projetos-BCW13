import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		PessoaContribuinte pf = new PessoaFisica("Tatiana", 50000, 5000);
		PessoaContribuinte pf2 = new PessoaFisica("Juliano", 90000, 6000);
		
		PessoaContribuinte pj = new PessoaJuridica("Renato", 100000, 15);
		PessoaContribuinte pj2 = new PessoaJuridica("Mariana", 120000, 20);
		
		// Java o array tem que ser populado por elementos do mesmo tipo.
		
		List<PessoaContribuinte> listaPessoas = new ArrayList<PessoaContribuinte>();
		
		listaPessoas.add(pf);
		listaPessoas.add(pf2);
		listaPessoas.add(pj);
		listaPessoas.add(pj2);
		
		double somaTotal = 0;
		
		for(PessoaContribuinte pc:listaPessoas) {
			System.out.printf("%s%s %.2f%n",pc.getNome(),", vai pagar:",pc.calcularImposto());
			somaTotal += pc.calcularImposto();
		}
		System.out.println("");
		System.out.printf("%s %.2f", "Total de imposto recebido:",somaTotal);
	
	}

}
