package aula04.exemplosVetores;

import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[10];
		//Opcionalmente podemos declarar os vetores assim:
		int vetor2[] = new int[20];
		//Para ler informações para vetor, posso usar um looping
		for(int i=0;i<10;i++){
			System.out.print("Digite um valor para vetor["+i+"]: ");
			vetor[i] = ler.nextInt();
		}
		//Para mostrar os dados do vetor na tela
		for(int i=0;i<10;i++){
			System.out.print(vetor[i]+" ");
		}
	}
}
