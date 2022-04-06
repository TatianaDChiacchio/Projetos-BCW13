
public class Principal {
	public static void main(String[] args) {
		
		//Conta c1 = new Conta("tatiana", 345, 234);
		
		ContaCorrente cr1 = new ContaCorrente("Tatiana", "123",1000);
		ContaEspecial ce1 = new ContaEspecial("Renato", "1234",1000, 1000);
		
		cr1.mostrarDados();
		ce1.mostrarDados();
		
		//cr1.sacar(1000);
		
		ce1.sacar(1200);
		
		ce1.ajustarLimite(2000);
		
		
	}
}
