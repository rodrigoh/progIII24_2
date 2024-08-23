package aula03.exemploCase;

import java.util.Scanner;

public class Exemplo1 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Digite uma letra: ");
    //Para ler um char do teclado, uso o método next(), que devolve uma String, depois uso o método charAt(int posicao), que pega o caractere da posição referida
    char letra = ler.next().charAt(0);
    switch (letra){
      case 'a':
      case 'A':
        System.out.println("A letra é 'a'");
        break;
      case 'b':
      case 'B':
        System.out.println("A letra é 'b'");
        break;
      case 'c':
      case 'C':
        System.out.println("A letra é 'c'");
        break;
      case 'd':
      case 'D':
        System.out.println("A letra é 'd'");
        break;
      case 'e':
      case 'E':
        System.out.println("A letra é 'e'");
        break;
        //o caso padrão é opcional
      default:
        System.out.println("Letra inválida");
    }
  }
}
