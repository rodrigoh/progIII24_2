package aula05.exercicios;

import java.util.Random;

/**
 * Criar um vetor A com 5 elementos, carregar ele com números aleatórios. Declarar um vetor B. Copiar todos os elementos
 * do Vetor A para o Vetor B e mostrar os dois na tela;
 */
public class Exercicio01 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    int[] vetorA = new int[5];
    int[] vetorB = new int[5];

    //Gerar números para o vetorA e copiar
    for(int i=0;i<vetorA.length;i++){
      vetorA[i] = aleatorio.nextInt(10);
      vetorB[i] = vetorA[i];
    }
    //System.arraycopy(vetorA,0,vetorB,0,vetorA.length);
    System.out.println("Dados no vetor A");
//    for(int i=0;i<vetorA.length;i++){
//      System.out.print(vetorA[i]+" ");
//    }
    for(int i:vetorA)
      System.out.print(i+" ");
    System.out.println("\nDados no vetor B");
    for(int i:vetorB)
      System.out.print(i+" ");
  }
}
