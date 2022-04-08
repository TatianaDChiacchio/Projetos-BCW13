import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// o valor do saque não pode ser maior que saldo
		// o valor do saque não pode ser maior que o limite do saque
		
		// IMPORTANTE
		// as regras de negócio sempre devem ser tratadas na camada de serviço e nunca
		// na classe principal

//		ContaBancaria cb = new ContaBancaria(1234,"Tatiana",1000,1500);
//		
//		try {
//			cb.sacar(1200);
//			System.out.println("Saque realizado com sucesso");
//		}catch (Exception e){
//			System.out.println(e.getMessage());
//		}
//		
//		
//		System.out.printf("%s%.2f%n","Seu saldo é de: ", cb.getSaldo());
		
		
		//************************Financiamento************************
		// O valor de entrada deve ser de no mínimo 20% do valor total
		// o número mínimo de parcelas é 5
		
		// o tratamento das regras de negócio, nese caso, deve ser executado antes da instanciação
		// do objeto, pois se, na hora da criação do financiamento, se as regras de negódio não
		// foram atendidas, o objeto nem deve ser instanciado.
		 Scanner scan = new Scanner(System.in);
		
		System.out.println("Preencha os dados abaixo para realizarmos o seu financiamento");
		
		double valor;
		System.out.println("Informe o valor do financiamento: ");
		valor = scan.nextDouble();
		System.out.println("");
		
		double valorEntrada;
		System.out.println("Informe o valor de entrada: ");
		valorEntrada = scan.nextDouble();
		System.out.println("");
		
		int parcelas;
		System.out.println("Informe o númnero de parcelas: ");
		parcelas = scan.nextInt();
		System.out.println("");
		
		
		try {
			Financiamento f1 = new Financiamento(valor,valorEntrada,parcelas);
			System.out.printf("%s %.2f", "O valor da parcela será de:", f1.prestacao());
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
