package aula05.exemplos;

import java.util.Scanner;

public class Exemplo1 {
  public static void main(String[] args) {
    int[] vetorNumeros = new int[10];
    String[] nomes = {"Ana", "Pedro", "Jonas", "Andre", "Maria", "Manu", "Isadora"};

    System.out.println("O tamanho do vetor de números é "+vetorNumeros.length);
    //Lendo um vetor de números do teclado
    for(int i=0;i<vetorNumeros.length;i++){
      System.out.print("vetor["+i+"]: ");
      vetorNumeros[i] = new Scanner(System.in).nextInt();
    }
    //Mostrando o vetor na tela
    for(int i:vetorNumeros)
      System.out.print(i+" ");
    System.out.println();
    //Converte uma String em um vetor de caracteres
    String nome = "Rodrigo Henrich";
    char[] nomeVetor = nome.toCharArray();
    for(char letra:nomeVetor)
      System.out.print(letra+" ");
  }
}
