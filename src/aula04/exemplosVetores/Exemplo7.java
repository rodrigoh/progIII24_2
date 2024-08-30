package aula04.exemplosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[100];
		int cont=0;
		char resposta;
		do{
			System.out.print("Entre com um valor para vetor["+cont+"]: ");
			vetor[cont] = ler.nextInt();
			cont++;
			System.out.print("Mais números (s = sim / n = não) ");
			//Lendo uma letra do teclado, usamos o método charAt(n) para pegar
			// apenas uma letra da String
			//o toLowerCase() converte uma String para minúsculo
			resposta = ler.next().toLowerCase().charAt(0);
		}
		while(resposta=='s');
		System.out.println("Dados no vetor...");
		for(int i=0;i<cont;i++){
			System.out.print(vetor[i]+" ");
		}
	}
}
