
public class Principal {
	public static void main(String[] args) {
		
		//Conta c1 = new Conta("tatiana", 345, 234);
		
		ContaCorrente cr1 = new ContaCorrente("Tatiana", "123",1000);
		ContaEspecial ce1 = new ContaEspecial("Renato", "1234",1000, 1000);
		
//		cr1.mostrarDados();
//		ce1.mostrarDados();
//		
//		//cr1.sacar(1000);
//		
//		ce1.sacar(1800);
//		
//		ce1.ajustarLimite(2000);
//		
//		System.out.println("----------------------------------------------");
//		cr1.mostrarDados();
//		cr1.depositar(245);
//		cr1.mostrarDados();
		
		System.out.println("----------------------------------------------");
		ce1.mostrarDados();
		ce1.depositar(1200);
		
		ce1.sacar(2400);
		
		//ce1.depositar(100);
		
		ce1.sacar(800);
		
		
		
	}
}
