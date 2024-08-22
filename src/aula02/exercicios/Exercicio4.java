package aula02.exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com uma medida em metros: ");
		float metros = ler.nextFloat();

		float cm = metros*100;
		System.out.printf("%.2f metros equivalem a %.2f cm\n",metros,cm);
	}
}
