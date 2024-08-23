package aula03.exemploIf;

import java.util.Scanner;

public class Exemplo1 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.printf("Digite um número: ");
    int num = ler.nextInt();
    //== -> testar se o número é igual
    //>= -> x >= y testa se o valor de x é maior ou igual a y
    //!= -> testa se é não igual
    if(num>0)
      System.out.println(num+" é positivo");
    else if(num<0)
      System.out.println(num+" é negativo");
    else
      System.out.println(num+" é zero");

  }
}
