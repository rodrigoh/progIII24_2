package aula04.exercicios;

import java.util.Scanner;

public class Exercicio14Op2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com um número maior que 1: ");
		int numero = ler.nextInt();

		int soma = 0;
		for(int i=1;i<numero;i++){
			System.out.print(i+"+");
			soma+=i;
		}
		soma+=numero;

		System.out.println(numero+"="+soma);
	}
}
