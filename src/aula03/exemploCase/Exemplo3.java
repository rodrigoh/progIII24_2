package aula03.exemploCase;

import java.util.Scanner;

public class Exemplo3 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.print("Entre com um número de 1 a 7: ");
    int dia = ler.nextInt();

    switch (dia){
      case 2, 3, 4, 5, 6 -> System.out.println("É dia útil");
      case 1, 7 -> System.out.println("É fim de semana");
    }
  }
}