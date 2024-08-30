package aula04.exemploMatrizes;

import java.util.Random;

public class Exemplo3 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] matriz = new int[5][5];

		System.out.println("Dados na matriz");
		for(int l=0;l< matriz.length;l++){
			for(int c=0;c<matriz[l].length;c++){
				matriz[l][c] = aleatorio.nextInt(10,100);
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
		System.out.println("Elementos na diagonal principal da matriz:");
		for(int i=0;i<matriz.length;i++)
			System.out.print(matriz[i][i]+" ");

		System.out.println("\nElementos na diagonal secundária");
		for(int l=0;l< matriz.length;l++){
			for(int c=0;c<matriz[l].length;c++){
				if(l+c == matriz.length-1)
					System.out.print(matriz[l][c]+" ");
			}
		}
	}
}
