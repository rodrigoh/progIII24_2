package aula04.exercicios;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int n1 = ler.nextInt();
		System.out.print("Digite outro número: ");
		int n2 = ler.nextInt();
		if(n1==n2){
			System.out.println("Digitou dois números iguais");
		}
		else if(n1>n2){
			System.out.println("O maior número digitado é "+n1);
		}
		else{
			System.out.println("O maior número digitado é "+n2);
		}

	}
}
