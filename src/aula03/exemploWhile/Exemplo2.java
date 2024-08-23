package aula03.exemploWhile;

import java.util.Scanner;

public class Exemplo2 {
  public static void main(String[] args) {
    //Validar uma nota entre 1 e 10
    Scanner ler = new Scanner(System.in);
    System.out.print("Entre com uma nota: ");
    int nota = ler.nextInt();
    while(nota<1 || nota>10){
      System.out.print("nota inválida, digite outra: ");
      nota = ler.nextInt();
    }
    System.out.println("Agora sim, a nota digitada foi "+nota);
  }
}
