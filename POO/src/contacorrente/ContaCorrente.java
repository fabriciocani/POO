package contacorrente;

public class ContaCorrente {

	private int numero;
	private double saldo;
	private Correntista correntista;

	public ContaCorrente(int nro, Correntista correntista) {
		numero = nro;
		this.correntista = correntista;
	}

	/**
	 * Construtor
	 * 
	 * @param nro
	 * @param correntista
	 * @param saldo
	 */

	public ContaCorrente(int nro, Correntista correntista, double saldo) {
		this(nro, correntista);
		this.saldo = saldo;

	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public Correntista getCorrentista() {
		return correntista;
	}

	public void depositar(double valor) {

		if (maiorQueZero(valor))
			saldo = saldo + valor;
		else
			System.out.println("seu burro, nao da pra depositar negativo");
	}

	public void sacar(double valor) {
		if (maiorQueZero(valor) && existeSaldoSuficiente(valor))
			saldo = saldo - valor;
		else
			System.out.println("seu pobre");
	}

	private boolean maiorQueZero(double valor) {
		if (valor > 0)
			return true;
		else
			return false;
	} 

	private boolean existeSaldoSuficiente(double valor) {
		if (saldo >= valor)
			return true;
		else
			return false;
	}

	public void transferir(ContaCorrente destino, double valor) {
		String mensagem = null;

		if (this.existeSaldoSuficiente(valor) == true) {
			
			this.sacar(valor);
			
			destino.depositar(valor);
			
			mensagem = "OK";
		} else
			mensagem = "Não transferiu";

		System.out.println(mensagem);
	}

}
