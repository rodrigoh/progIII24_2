package aula04.exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Qual o nome do nadador: ");
		String nome = ler.next();
		System.out.print("Qual a idade do "+nome+": ");
		int idade = ler.nextInt();
		if(idade>=5 && idade<=7){
			System.out.println(nome+" se encaixa na categoria Infantil A");
		}
		else if(idade>=8 && idade<=10){
			System.out.println(nome+" se encaixa na categoria Infantil B");
		}
		else if(idade>=11 && idade<=13){
			System.out.println(nome+" se encaixa na categoria Juvenil A");
		}
		else if(idade>=14 && idade<=17){
			System.out.println(nome+" se encaixa na categoria Juvenil B");
		}
		else if(idade>=18){
			System.out.println(nome+" se encaixa na categoria Adulto");
		}
		else{
			System.out.println(nome+", talvez seja muito jovem para nadar");
		}
	}
}
