package encapsulamento;

public class NotaFiscal {
	
	private int numero;
	private String data;
	
	private Vendedor vendedor; 
	private Produto[] produtos; // 10 no maximo
	
	public NotaFiscal(int numero, String data, Vendedor vendedor) {
		super();
		this.numero = numero;
		this.data = data;
		this.vendedor = vendedor;
	}
	
	// getter para numero e data
	// getter para vendedor
	// getter e setter para produtos
	
	// construtor com numero, data e vendedor
	
	// produtos adicionados por meio de um metodo 
	// chamado adicionarProdutos, que faz a verificacao pelo codigo
	// se o produto ja existe. Este metodo deve retornar um booleano
	
	// metodo chamado calcularTotal que retorna o valor total da nota
	
	
	

}
