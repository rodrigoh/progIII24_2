package aula02.exercicios;

import java.util.Scanner;

/**
 * Uma equipe de Fórmula 1 deseja calcular o número mínimo de litros que deverá colocar no tanque de seu carro para que ele
 * possa percorrer um determinado número de voltas até o primeiro reabastecimento. Escreva um programa que leia o comprimento da
 * pista (em metros), o número total de voltas a serem percorridas no grande prêmio, o número de reabastecimentos desejados e o
 * consumo de combustível do carro (em Km/L). Calcular e escrever o número mínimo de litros necessários para percorrer até o primeiro
 * reabastecimento. Observação: Considere que o número de voltas entre os reabastecimentos é o mesmo.
 */
public class Exercicio14 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Qual o comprimento da pista em metros: ");
    float comprimento = ler.nextFloat()/1000;
    System.out.print("Quantas voltas tem o GP: ");
    int nVoltas = ler.nextInt();
    System.out.print("A equipe planeja quantos reabastecimentos: ");
    int nAbastecimentos = ler.nextInt();
    System.out.print("Quantos km o F1 faz por litro: ");
    float kmHora = ler.nextFloat();
    float distanciaTotal = nVoltas*comprimento;
    float litrosTotal = distanciaTotal/kmHora;
    float litrosAbastecimento = litrosTotal/nAbastecimentos;
    System.out.printf("Para percorrer os %.2f km do GP, serão necessários %.2f litros de combustível em cada um dos %d abastecimentos\n",distanciaTotal,litrosAbastecimento,nAbastecimentos);

  }
}
