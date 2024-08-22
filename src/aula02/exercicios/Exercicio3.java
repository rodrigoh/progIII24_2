package aula02.exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Qual a primeira nota: ");
		float n1 = ler.nextFloat();
		System.out.print("Qual a segunda nota: ");
		float n2 = ler.nextFloat();
		System.out.print("Qual a terceira nota: ");
		float n3 = ler.nextFloat();
		System.out.print("Qual a quarta nota: ");
		float n4 = ler.nextFloat();

		float media = (n1+n2+n3+n4)/4;
		System.out.printf("A média vale %.2f\n",media);
	}
}
