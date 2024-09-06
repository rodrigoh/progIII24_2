package aula05.exercicios;

import java.util.Random;
import java.util.Scanner;

/**
 * Ler 6 números inteiros para preencher uma matriz D 2x3, ou seja, com 2 linhas e 3 colunas (considere que não serão
 * informados valores duplicados). A seguir, ler um número inteiro X e escrever uma mensagem indicando se o valor de X
 * existe ou não na matriz D.
 */
public class Exercicio06 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    Scanner ler = new Scanner(System.in);

    int[][] matriz = new int[2][3];

    System.out.println("Dados gerado para matriz:");
    for(int l=0;l<2;l++){
      for(int c=0;c<3;c++){
        matriz[l][c] = aleatorio.nextInt(10);
        System.out.printf("%02d ",matriz[l][c]);
      }
      System.out.println();
    }

    System.out.print("Qual valor devo pesquisar na matriz: ");
    int valorX = ler.nextInt();

    boolean achei = false;
    for(int[] linha:matriz){
      for(int coluna:linha){
        if(coluna==valorX)
          achei = true;
      }
    }
    if(achei)
      System.out.println("O valor "+valorX+" está presente na matriz");
    else
      System.out.println("O valor "+valorX+" não está presente na matriz");

  }
}
