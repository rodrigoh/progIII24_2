package aula02.exercicios;

import java.util.Scanner;

/*
Escreva uma classe Java que peça um número e então mostre a mensagem
''O número informado foi [número]''.
 */
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		System.out.print("Entre com um número: ");
		num = ler.nextInt();
		System.out.println("O número digitado foi "+num);
		System.out.printf("O número digitado foi %d\n",num);

	}
}
