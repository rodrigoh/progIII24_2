package aula04.exemploMatrizes;

import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//tipo[][] nome = new tipo[quant linhas][quant colunas]
		int[][] matriz = new int[3][5];
		//Lendo a matriz do teclado
		for(int l=0;l<3;l++){
			for(int c=0;c<5;c++){
				System.out.print("matriz["+l+"]["+c+"] = ");
				matriz[l][c] = ler.nextInt();
			}
		}
		//Mostrando a matriz na tela
		for(int l=0;l<3;l++) {
			for (int c = 0; c < 5; c++) {
				System.out.printf("%02d ", matriz[l][c]);
			}
			System.out.println();
		}
	}
}
