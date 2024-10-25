package aula12.exemploExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int numero = 0;
    boolean okNumero = false;
    //do while e try catch resolver o problema da digitação de uma letra no lugar de número...
    do {
      try {
        System.out.print("Digite um número: ");
        numero = ler.nextInt();
        okNumero = true;
        System.out.println("O número digitado foi " + numero);
      } catch (InputMismatchException e) {
        //ler.next();
        ler = new Scanner(System.in);
        System.out.println("Eu disse um número!");
        okNumero = false;
      }
    }
    while (!okNumero);
  }
}
