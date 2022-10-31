package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;

		System.out.println("Saldo da primeiraConta: " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segundaConta: " + segundaConta.saldo);
		
		segundaConta.saldo +=100;
		System.out.println("Saldo da primeiraConta: " + primeiraConta.saldo);
		System.out.println("Saldo da segundaConta: " + segundaConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta!");
		}
	}

}
