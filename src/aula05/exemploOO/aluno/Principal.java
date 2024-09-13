package aula05.exemploOO.aluno;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Aluno alunoUm = new Aluno("Jonas", "a123", "Programação");

//		System.out.print("Qual a matrícula do aluno: ");
//		alunoUm.matricula = ler.next();
//
//		System.out.print("Qual o nome do aluno: ");
//		alunoUm.nome = ler.next();
//
//		System.out.print("Qual o curso do aluno: ");
//		alunoUm.curso = ler.next();

		System.out.print("Quantas faltas tem o aluno: ");
		alunoUm.faltas = ler.nextInt();

		float[] notas = new float[3];
		for(int i=0;i< notas.length;i++){
			System.out.print("Informe a nota: ");
			notas[i] = ler.nextFloat();
		}
		alunoUm.preencherNotas(notas);

		System.out.println("O aluno "+alunoUm.nome+" tem média "+alunoUm.calculaMedia());
		System.out.println("E ele está "+alunoUm.verificaStatus());
	}
}
