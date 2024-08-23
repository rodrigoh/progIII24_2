package aula03.exemploCase;

import java.util.Scanner;

public class Exemplo4 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.print("Entre com o nome de um mês: ");
    String mes = ler.next();

    switch (mes){
      case "janeiro","fevereiro","dezembro"-> System.out.println("Estamos em férias escolares");
      default -> System.out.println("Estamos em período letivo");
    }
  }
}
