package encapsulamento;

public class NotaFiscal {

	private int numero;
	private String data;

	private Vendedor vendedor;
	private Produto[] produtos; // 10 no maximo

	public NotaFiscal(int numero, String data, Vendedor vendedor) {
		produtos = new Produto[3];
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

	public boolean adicionarProdutos(Produto p){
		
		if(existeEspacoNoVetor()){
			
			if(produtoJaExiste(p)==false){
				
				
				
				
				
				for(int i = 0; i< 3; i++){
					if(produtos[i]==null){
						produtos[i]=p;
						return true;
					}
				}
			}
		}
		return false;
		
	}

	private boolean produtoJaExiste(Produto produto) {
		Produto temporario = null;
		for(int i = 0; i< 3; i++){
			temporario = produtos[i];
			if(temporario!=null)
				if(temporario.getCodigo()==produto.getCodigo())
					return true;
		}
		return false;
	}

	private boolean existeEspacoNoVetor() {
		
		for(int i = 0; i< 3; i++){
			if(produtos[i]==null)
				return true;
		}
		return false;
	}

	public double somarProdutos(){
		double soma = 0;
		for(int i =0; i< 3;i++)
			soma = soma + produtos[i].getPreco();
		return soma;
	}
	
	
	
	
	
	
	
}
