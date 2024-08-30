package aula04.exercicios;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com o valor da base: ");
		int base = ler.nextInt();
		System.out.print("Entre com o valor do expoente: ");
		int exp = ler.nextInt();
		int resp = 1;
		for(int i=0;i<exp;i++){
			resp*=base;
		}
		System.out.println(base+"^"+exp+"="+resp);
	}
}
