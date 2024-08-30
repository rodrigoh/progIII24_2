package aula04.exemplosVetores;

import java.util.Scanner;

public class Exemplo2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[5];
		System.out.println("O tamanho do vetor é "+vetor.length);
		//Para ler informações para vetor, posso usar um looping
		for(int i=0;i<vetor.length;i++){
			System.out.print("Digite um valor para vetor["+i+"]: ");
			vetor[i] = ler.nextInt();
		}
		//Para mostrar os dados do vetor na tela
		for(int i=0;i<vetor.length;i++){
			System.out.print(vetor[i]+" ");
		}
	}
}
