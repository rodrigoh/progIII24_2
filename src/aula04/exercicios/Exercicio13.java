package aula04.exercicios;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com um número: ");
		int n1 = ler.nextInt();
		System.out.print("Entre com outro número: ");
		int n2 = ler.nextInt();
		System.out.print("Entre com mais um número: ");
		int n3 = ler.nextInt();
		//n1 n2 n3
		//n1 n3 n2
		//n2 n1 n3
		//n2 n3 n1
		//n3 n1 n2
		//n3 n2 n1
		if(n1<n2 && n2<n3)
			System.out.print(n1+", "+n2+", "+n3);
		else if(n1<n3 && n3<n2)
			System.out.print(n1+", "+n3+", "+n2);
		else if(n2<n1 && n1<n3)
			System.out.print(n2+", "+n1+", "+n3);
		else if(n2<n3 && n3<n1)
			System.out.print(n2+", "+n3+", "+n1);
		else if(n3<n1 && n1<n2)
			System.out.print(n3+", "+n1+", "+n2);
		else if(n3<n2 && n2<n1)
			System.out.print(n3+", "+n2+", "+n1);
		else
			System.out.println("Parece que alguns dos números digitados é igual");
	}
}
