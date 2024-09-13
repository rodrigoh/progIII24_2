package aula05.exercicios;

import java.util.Random;

/**
 * Declare três vetores com até 100 números, o primeiro deve receber números aleatórios, o segundo deve receber os números
 * pares do primeiro vetor e o segundo os números ímpares do primeiro vetor. Ao final mostrar os três vetores
 */
public class Exercicio03 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    int[] vetor = new int[100];
    int[] par = new int[100];
    int[] impar = new int[100];
    int cp = 0;
    int ci = 0;
    System.out.println("Dados no vetor: ");
    for(int i=0;i<vetor.length;i++){
      vetor[i] = aleatorio.nextInt(1,200);
      if(vetor[i]%2==0)
        par[cp++] = vetor[i];
      else
        impar[ci++] = vetor[i];
      System.out.print(vetor[i]+" ");
    }
    System.out.println("\nDos números em vetor são pares");
    for(int i=0;i<cp;i++)
      System.out.print(par[i]+" ");

    System.out.println("\nDos números em vetor são impares");
    for(int i=0;i<ci;i++)
      System.out.print(impar[i]+" ");

  }
}
