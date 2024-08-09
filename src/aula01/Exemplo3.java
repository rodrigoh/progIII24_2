package aula01;

import java.util.Scanner;

public class Exemplo3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		//scanf("%d",&numero);
		int numero = ler.nextInt();
		System.out.println("O valor digitado foi "+numero);
		System.out.print("Digite sua altura em metros: ");
		float altura = ler.nextFloat();
		System.out.printf("Sua altura é %.2f\n",altura);

	}
}
