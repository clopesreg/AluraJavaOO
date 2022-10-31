package bytebank;

public class testaMetodo {

	public static void main(String[] args) {
		Conta contaDoCarlos = new Conta();
		contaDoCarlos.saldo = 100;
		contaDoCarlos.deposita(150);
		
		System.out.println(contaDoCarlos.saldo);
		
		contaDoCarlos.saca(50);
		System.out.println(contaDoCarlos.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoCarlos);
		
		if(sucessoTransferencia) {
			System.out.println("Transferencia com sucesso!");
		}else {
			System.out.println("Saldo insuficiente!");
		}
		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoCarlos.saldo);
		
		contaDoCarlos.titular = "Carlos Lopes";
		System.out.println(contaDoCarlos.titular);
	}

}
