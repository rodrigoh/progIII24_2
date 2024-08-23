package aula03.exemploIf;

import java.util.Scanner;

public class Exemplo2 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("digite um número ");
    int num = ler.nextInt();
    //Número precisa estar entre 10 e 20
    //Os operadores de comparação permitem testes com tipos primitivos float, int, double, char
    if(num>=10 && num<=20){
      System.out.println("Número está correto!");
    }
    else{
      System.out.println("Número não está correto");
      System.out.println("Tente novamente");
    }
  }
}
