package aula04.exemploMatrizes;

public class Exemplo2 {
	public static void main(String[] args) {
		int[][] matriz = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,
						20}};
		//Chamando o length diretamente da matriz descubro a quantidade de linhas
		// dela
		int linhas = matriz.length;
		//Chamando o length diretamente de uma das colunas da matriz, descubro a
		// quantidade de colunas
		int colunas = matriz[0].length;
		System.out.println("Quant linhas = "+linhas);
		System.out.println("Quant colunas = "+colunas);

		for(int l=0;l<matriz.length;l++){
			for(int c=0;c<matriz[l].length;c++){
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
	}
}
