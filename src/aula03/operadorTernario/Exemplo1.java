package aula03.operadorTernario;

import java.util.Scanner;

public class Exemplo1 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Entre com um número: ");
    int numero = ler.nextInt();
    //(expressão booleana) ? código true : código false;
    System.out.println(numero+" é par? "+(numero%2==0?"sim":"não"));
  }
}
