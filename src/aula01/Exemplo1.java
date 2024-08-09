package aula01;

public class Exemplo1 {
	public static void main(String[] args){
		//Para imprimir uma mensagem na tela
		System.out.println("Imprime a mensagem e quebra linha");
		System.out.print("Imprime a mensagem sem quebrar a linha\n");
		System.out.printf("Imprime a mensagem na tela\n");
		//Declarando algumas variáveis
		String nome = "Jonas";
		int altura = 180;
		//Imprimindo com o printf
		System.out.printf("Nome: %s tem altura: %d cm\n",nome,altura);
		//Imprimindo com o print ou println
		System.out.println("Nome: "+nome+" tem altura: "+altura+" cm");
	}
}
