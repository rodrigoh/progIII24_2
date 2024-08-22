package aula02.exercicios;

import java.util.Scanner;

/**
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
 * Calcule e mostre o total do seu salário no referido mês.
 */

public class Exercicio6 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Digite o valor da hora trabalhada: ");
    //scanf("%f",&valorHora)
    float valorHora = ler.nextFloat();
    System.out.print("Quantas horas foram trabalhadas no mês: ");
    float quantHoras = ler.nextFloat();
    float salario = valorHora * quantHoras;
    System.out.printf("Seu salário será de R$%.2f\n",salario);
    System.out.println("Seu salário será de R$"+salario);
    //Usando o método format da classe String para montar uma String com um formato específico
    String resultado = String.format("R$ %.2f",salario);
    System.out.println("Seu salário será de R$"+String.format("%.2f",salario));
  }
}
