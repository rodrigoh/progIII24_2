package aula02;

import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		System.out.print("Qual seu nome: ");
		String nome = ler.next();
		System.out.print(nome+" qual sua altura em metros: ");
		float altura = ler.nextFloat();
		System.out.print(nome+" qual sua idade: ");
		int idade = ler.nextInt();
		//Mostrando as informações na tela
		System.out.printf("%s tem %d anos e mede %.2f metros\n",nome, idade,
						altura);
		System.out.println(nome+" tem "+idade+" e mede "+altura+" metros");

	}
}
