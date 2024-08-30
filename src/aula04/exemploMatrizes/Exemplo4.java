package aula04.exemploMatrizes;

import java.util.Random;

public class Exemplo4 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] matriz = new int[4][5];
		for(int l=0;l<matriz.length;l++){
			for(int c=0;c<matriz[l].length;c++){
				matriz[l][c] = aleatorio.nextInt(100);
			}
		}
		for(int[] linha:matriz){
			for(int coluna:linha){
				System.out.printf("%02d ",coluna);
			}
			System.out.println();
		}
	}
}
