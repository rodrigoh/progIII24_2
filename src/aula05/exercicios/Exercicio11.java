package aula05.exercicios;

import java.util.Random;

/**
 * Faça um programa para gerar automaticamente números entre 1 e 99 de uma cartela de bingo. Sabendo que cada cartela deverá
 * conter 5 linhas de 5 números, gere estes dados de modo a não ter números repetidos dentro das cartelas. O programa deve
 * exibir na tela a cartela gerada.
 */
public class Exercicio11 {
  public static boolean numeroValido(int[][] matriz, int valor){
    for(int l=0;l<matriz.length;l++){
      for(int c=0;c<matriz[l].length;c++){
        if(matriz[l][c]==valor)
          return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Random aleatorio = new Random();
    int[][] cartela = new int[5][5];
    for(int l=0;l<cartela.length;l++) {
      for (int c=0; c<cartela[l].length;) {
        int numero = aleatorio.nextInt(1,100);
        if(numeroValido(cartela,numero)){
          cartela[l][c] = numero;
          c++;
        }
      }
    }
    System.out.println("Cartela de bingo...");
    for(int l=0;l<cartela.length;l++) {
      for (int c = 0; c < cartela[l].length; c++) {
        System.out.printf("%02d ",cartela[l][c]);
      }
      System.out.println();
    }
  }
}
