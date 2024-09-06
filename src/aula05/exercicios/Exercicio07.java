package aula05.exercicios;

import java.util.Random;

/**
 * Carregar uma matriz SOMA 4x4, calcular e escrever as seguintes somas:
 *  da linha de índice 3
 *  da coluna de índice 2
 * de todos os elementos da matriz
 */
public class Exercicio07 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    int[][] soma = new int[4][4];
    System.out.println("Dados na matriz: ");
    for(int i=0;i<4;i++){
      for(int j=0;j<4;j++){
        soma[i][j] = aleatorio.nextInt(30);
        System.out.printf("%02d ",soma[i][j]);
      }
      System.out.println();
    }
    int somaLinha = 0;
    int somaColuna = 0;
    int somaTotal = 0;
    for(int i=0;i<4;i++) {
      for (int j = 0; j < 4; j++) {
        if(i==3)
          somaLinha+=soma[i][j];
        if(j==2)
          somaColuna+=soma[i][j];
        somaTotal+=soma[i][j];
      }
    }
    System.out.println("A soma dos elementos na linha de índice 3 vale "+somaLinha);
    System.out.println("A soma dos elementos na coluna de índice 2 vale "+somaColuna);
    System.out.println("A soma de todos os elementos da matriz vale "+somaTotal);
  }
}
