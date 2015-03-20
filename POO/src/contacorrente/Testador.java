package contacorrente;

public class Testador {

	public static void main(String[] args) {
		
		Correntista cor = new Correntista("Ximbinha","2334556");
		
		ContaCorrente cc = new ContaCorrente(2345, cor );
		
		cc.depositar(500);
		
		// fazer um método que permita transferir valores de uma
		// conta corrente para outra
		
		System.out.println(cc.getCorrentista().getNome());
		
		System.out.println(cc.getSaldo());
		
		System.out.println("saque ");
		
		cc.sacar(4300);
		
		System.out.println(cc.getSaldo());
		
	}

}
