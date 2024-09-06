package aula05.exercicios;

public class Exercicio05 {
  public static void main(String[] args) {
    int[] vetor = {18, 7, 12, 3, 15, 20, 6, 11, 5, 19, 2, 9, 17, 10, 4, 8, 14, 1, 16, 13};
    System.out.println("Vetor original: ");
    for(int i:vetor)
      System.out.print(i+" ");
    for(int i=0;i<vetor.length;i++){
      for(int j=i;j<vetor.length;j++){
        if(vetor[i]>vetor[j]){
          int aux = vetor[i];
          vetor[i] = vetor[j];
          vetor[j] = aux;
        }
      }
    }
    System.out.println("\nVetor ordenado: ");
    for(int i:vetor)
      System.out.print(i+" ");
  }
}