package aula03.exemploCase;

import java.util.Scanner;

public class Exemplo2 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.print("Entre com um número de 1 a 7: ");
    int dia = ler.nextInt();
    //Caso um dos cases tenha mais de uma instrução, devemos usar {}
    switch (dia){
      case 1 -> System.out.println("É domingo!");
      case 2 -> {
        System.out.println("É segunda feira");
        System.out.println("É dia útil");
      }
      case 3 ->{
        System.out.println("É terça feira");
        System.out.println("É dia útil");
      }
      case 4 ->{
        System.out.println("É quarta feira");
        System.out.println("É dia útil");
      }
      case 5 ->{
        System.out.println("É quinta feira");
        System.out.println("É dia útil");
      }
      case 6 ->{
        System.out.println("É sexta feira");
        System.out.println("É dia útil");
      }
      case 7 -> System.out.println("É sábado");
      default -> System.out.println("Número não corresponde a nenhum dia da semana");

    }
  }
}
