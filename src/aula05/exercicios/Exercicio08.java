package aula05.exercicios;

import java.util.Random;

/**
 * Ler uma matriz G 3x3 e criar 2 vetores, SL e SC, de 3 elementos cada, contendo respectivamente as somas das linhas e
 * das colunas de G. Escrever os vetores criados.
 */
public class Exercicio08 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    int[][] matriz = new int[3][3];
    int[] sl = new int[3];
    int[] sc = new int[3];
    for(int i=0;i<matriz.length;i++){
      for(int j=0;j<matriz[i].length;j++){
        matriz[i][j] = aleatorio.nextInt(1,20);
        System.out.printf("%02d ",matriz[i][j]);
      }
      System.out.println();
    }
    for(int i=0;i<matriz.length;i++){
      for(int j=0;j<matriz[i].length;j++){
        sl[i]+=matriz[i][j];
        sc[i]+=matriz[j][i];
      }
    }
    System.out.println("Dados no vetor soma linha: ");
    for(int i:sl)
      System.out.print(i+" ");
    System.out.println("\nDados no vetor soma coluna: ");
    for(int i:sc)
      System.out.print(i+" ");
  }
}
