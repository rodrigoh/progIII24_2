package aula02.exercicios;

import java.util.Scanner;

/**
 * Um motorista de táxi deseja calcular o rendimento de seu carro na praça. Sabendo-se que o preço do combustível é de R$ 6,15,
 * escreva um programa para ler: a marcação do odômetro (Km) no início do dia, a marcação (Km) no final do dia, o número de litros
 * de combustível gasto e o valor total (R$) recebido dos passageiros. Calcular e escrever: a média do consumo em Km/L e o lucro
 * (líquido) do dia.
 */
public class Exercicio13 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Qual a marcação do odômetro no início do dia: ");
    int kmInicial = ler.nextInt();
    System.out.print("Qual a marcação do odômetro no final do dia: ");
    int kmFinal = ler.nextInt();
    System.out.print("Quantos litros de combustível foram usados: ");
    float litros = ler.nextFloat();
    System.out.print("Qual o valor total recebido: ");
    float valor = ler.nextFloat();
    float distancia = kmFinal - kmInicial;
    float autonomia = distancia/litros;
    float lucro = valor-(litros*6.15f);
    System.out.printf("Seu veículo tem uma autonomia de %.3f km/l e seu lucro de hoje foi R$%.2f\n", autonomia, lucro);
  }
}
