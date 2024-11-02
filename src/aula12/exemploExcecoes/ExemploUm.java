package aula12.exemploExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploUm {
	public static void main(String[] args) {
		try {
			Scanner ler = new Scanner(System.in);
			System.out.print("Entre com um número: ");
			int n1 = ler.nextInt();
			System.out.print("Entre com outro número: ");
			int n2 = ler.nextInt();
			float resp = n1 / n2;
			System.out.println(resp);
		}
		catch (InputMismatchException e){
			System.out.println("os valores precisam ser números");
		}
		catch (ArithmeticException e){
			System.out.println("Não é possível dividir por zero");
		}
	}
}
