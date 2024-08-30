package aula04.exemplosVetores;

import java.util.Scanner;

public class Exemplo3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int[] vetor = {5,8,7,4,6};
		//Lembrando que ao igualar dois vetores estou apenas apontando para o
		// mesmo endereço de memória
		int[] vetorDois = vetor;

		System.out.println("Dados no vetor 1:");
		for(int i=0;i<vetor.length;i++){
			System.out.print(vetor[i]+" ");
		}
		System.out.println("\nDados no vetor 2:");
		for(int i=0;i<vetorDois.length;i++){
			System.out.print(vetorDois[i]+" ");
		}
		vetorDois[0] = 1000;
		vetor[1] = 2000;
		System.out.println("\nDados no vetor 1:");
		for(int i=0;i<vetor.length;i++){
			System.out.print(vetor[i]+" ");
		}
		System.out.println("\nDados no vetor 2:");
		for(int i=0;i<vetorDois.length;i++){
			System.out.print(vetorDois[i]+" ");
		}
	}
}
