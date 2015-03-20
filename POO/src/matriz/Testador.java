package matriz;

public class Testador {

	public static void main(String[] args) {

		int[][] atributoMatriz = null;
		
		
		
		atributoMatriz = Testador.criarMatriz(5, 5);
		
		

		System.out.println("Maior: " + m.encontrarMaiorElemento());
		System.out.println("Soma " + m.somarDiagonalPrincipal());
	}

	public static int[][] criarMatriz(int linhas, int colunas) {
		int[][] matriz = new int[linhas][colunas];

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {

				matriz[i][j] = (int) (Math.random() * 100);

				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();

		}
		return matriz;

	}

}
