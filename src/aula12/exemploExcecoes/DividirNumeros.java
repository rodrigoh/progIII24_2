package aula12.exemploExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividirNumeros {
  public static void main(String[] args) {
    try {
      Scanner ler = new Scanner(System.in);
      System.out.print("Digite um número: ");
      int n1 = ler.nextInt();
      System.out.print("Digite outro número: ");
      int n2 = ler.nextInt();
      float resutlado = n1 / n2;
      System.out.println("O resultado de " + n1 + " / " + n2 + " = " + resutlado);
    }
    catch (InputMismatchException erro){
      System.out.println("Digite números e não letras!");
    }
    catch (ArithmeticException erro){
      System.out.println("Não é possível dividir por zero");
    }
    finally {
      System.out.println("Sempre sou executado!");
    }
  }
}
