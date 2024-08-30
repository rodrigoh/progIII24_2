package aula04.numerosAleatorios;

import java.util.Random;

public class Exemplo1 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int numero = aleatorio.nextInt();
		System.out.println("Gerei um inteiro aleatório: "+numero);
		numero = aleatorio.nextInt(100);
		System.out.println("Gerei um inteiro aleatório entre 0 e 100: "+numero);
		numero = aleatorio.nextInt(50, 100);
		System.out.println("Gerei um inteiro aleatório entre 50 e 100: "+numero);
		boolean flag = aleatorio.nextBoolean();
		System.out.println("Agora é "+flag);
		numero = aleatorio.nextInt(65,90);
		char letra = (char) numero;
		System.out.println("Letra aleatória "+letra);
	}
}
