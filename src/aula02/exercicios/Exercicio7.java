package aula02.exercicios;

import java.util.Scanner;

/**
 * Faça uma classe Java que leia a altura e o peso de uma pessoa e calcule seu IMC IMC = peso/altura²
 */
public class Exercicio7 {
  public static void main(String[] args) {
    //Scanner ler = new Scanner(System.in);
    System.out.print("Qual seu peso em kg: ");
    float peso = new Scanner(System.in).nextFloat();
    System.out.print("Qual sua altura em metros: ");
    float altura = new Scanner(System.in).nextFloat();
    float imc = peso/(float)Math.pow(altura,2);
    System.out.printf("Seu IMC é de %.3f\n",imc);
  }
}
