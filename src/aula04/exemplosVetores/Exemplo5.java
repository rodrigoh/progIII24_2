package aula04.exemplosVetores;

import java.util.Scanner;

public class Exemplo5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int[] vetor = {5,8,7,4,6};
		int[] vetorDois = new int[5];

		System.out.println("Dados no vetor 1:");
		for(int i=0;i<vetor.length;i++){
			System.out.print(vetor[i]+" ");
		}
		System.out.println("\nDados no vetor 2:");
		for(int i=0;i<vetorDois.length;i++){
			System.out.print(vetorDois[i]+" ");
		}
		//Realizando uma cópia manual do vetor
//		for(int i=0;i<vetor.length;i++){
//			vetorDois[i] = vetor[i];
//		}
		//Outra opção é usar o System.arrayCopy
		System.arraycopy(vetor,0,vetorDois,0,vetor.length);
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
