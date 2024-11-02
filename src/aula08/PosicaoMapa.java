package aula08;

import java.util.Scanner;

public class PosicaoMapa {

	public static int posicaoColuna(String mensagem){
		Scanner ler = new Scanner(System.in);
		String letras = "ABCDEFGHIJ";
		int posicao;
		do {
			System.out.print(mensagem+": ");
			String letra = ler.next().toUpperCase();
			posicao = letras.indexOf(letra);
		}
		while (posicao==-1);
		return posicao;
	}

	public static int posicaoLinha(String mensagem){
		Scanner ler = new Scanner(System.in);
		String numeros = "0123456789";
		int posicao;
		do {
			System.out.print(mensagem+": ");
			String letra = ler.next();
			posicao = numeros.indexOf(letra);
		}
		while (posicao==-1);
		return posicao;
	}


	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int p = posicaoColuna("Informe uma coluna");
		System.out.println(p);
		p = posicaoLinha("Informe uma linha");
		System.out.println(p);
	}
}
