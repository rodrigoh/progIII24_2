package aula03.exemploDoWhile;

import java.util.Scanner;

public class Exemplo3 {
  public static void main(String[] args) {
    //Validar uma nota entre 1 e 10
    Scanner ler = new Scanner(System.in);
    int nota;
    do{
      System.out.print("Digite uma nota: ");
      nota = ler.nextInt();
      if(nota<1 || nota>10)
        System.out.println("Nota inválida, precisa estar entre 1 e 10");
    }
    while(nota<1 || nota>10);
    System.out.println("Agora sim, a nota digitada foi "+nota);
  }
}
