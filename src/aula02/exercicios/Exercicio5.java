package aula02.exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com o valor do raio: ");
		float r = ler.nextFloat();
		float area = (float) (Math.PI*Math.pow(r,2));
		System.out.printf("O círculo de raio %.2f cm tem área de %.2f cm²\n",r,
						area);
	}
}
