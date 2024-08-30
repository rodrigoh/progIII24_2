package aula04.exercicios;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com um número maior que 1: ");
		int numero = ler.nextInt();

		int soma = 0;
		for(int i=1;i<=numero;i++){
			soma+=i;
		}
		System.out.println("A soma dos números entre 1 e "+numero+" vale "+soma);
	}
}
