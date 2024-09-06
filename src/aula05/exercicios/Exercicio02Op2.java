package aula05.exercicios;
/**
 * Faça um programa para ler 10 números DIFERENTES a serem armazenados em um vetor. Os dados deverão ser armazenados no
 * vetor na ordem que forem sendo lidos, sendo que caso o usuário digite um número que já foi digitado anteriormente, o
 * programa deverá pedir para ele digitar outro número. Note que cada valor digitado pelo usuário deve ser pesquisado no
 * vetor, verificando se ele existe entre os números que já foram fornecidos. Exibir na tela o vetor final que foi
 * digitado.
 */

import java.util.Scanner;

public class Exercicio02Op2 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[] numeros = new int[10];
    int i=0;
    while(i<numeros.length){
      System.out.print("Informe um valor para números["+i+"]: ");
      numeros[i] = ler.nextInt();
      boolean novoValor = true;
      for(int j=0;j<i;j++){
        if(numeros[i]==numeros[j])
          novoValor = false;
      }
      if(novoValor)
        i++;
    }
    for(i=0;i<numeros.length;i++){
      System.out.print(numeros[i]+" ");
    }
  }
}
