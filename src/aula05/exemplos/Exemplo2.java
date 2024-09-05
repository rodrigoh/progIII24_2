package aula05.exemplos;

import java.util.Random;
import java.util.Scanner;

public class Exemplo2 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Random aleatorio = new Random();
    int[][] matriz = new int[5][5];
    //Percorrendo uma matriz de números inteiros, gerando valores aleatórios para a matriz e imprimindo ela na tela...
    for(int l=0;l<matriz.length;l++){
      for(int c=0;c<matriz[l].length;c++){
        //matriz[l][c] = ler.nextInt();
        matriz[l][c] = aleatorio.nextInt(10,100);
        System.out.print(String.format("%02d ",matriz[l][c]));
      }
      System.out.println();
    }
    System.out.println("Inicializando uma matriz no momento da declaração...");
    int[][] matrizDois = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    System.out.println("Usando o for simplificado para matrizes");
    for(int[] linha:matrizDois){
      for(int coluna:linha){
        System.out.printf("%02d ",coluna);
      }
      System.out.println();
    }
  }
}
