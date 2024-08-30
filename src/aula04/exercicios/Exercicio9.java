package aula04.exercicios;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float somaNota = 0;
		for(int i=1;i<=3;i++){
			System.out.print("Digite a "+i+"° nota do aluno: ");
			somaNota+=ler.nextFloat();
		}
		float media = somaNota/3;
		System.out.println("A média do aluno é "+media);
		if(media >= 7)
			System.out.println("O aluno está aprovado");
		else if(media >= 5)
			System.out.println("O aluno está em recuperação");
		else
			System.out.println("O aluno está reprovado");
	}
}
