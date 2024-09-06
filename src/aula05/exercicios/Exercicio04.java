package aula05.exercicios;

import java.util.Scanner;

/**
 * Leia números de matrículas de alunos e armazene-os em um vetor até o vetor ser preenchido por 10 matrículas. Esses
 * números são distintos, ou seja, o vetor não armazenará valores repetidos. Para cada aluno calcule a média de 3 notas.
 * Armazenar a média em outro vetor. Ao final mostrar cada aluno e suas respectivas notas (médias)
 */

public class Exercicio04 {

  public static boolean matriculaNova(int[] matriculas, int matricula){
    for(int i=0;i<matriculas.length;i++){
      if(matriculas[i]==matricula)
        return false;
    }
    return true;
  }

  public static int leNumeroInt(String mensagem){
    System.out.print(mensagem+": ");
    return new Scanner(System.in).nextInt();
  }

  public static float leNumeroFloat(String mensagem){
    System.out.print(mensagem+": ");
    return new Scanner(System.in).nextFloat();
  }

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[] matriculas = new int[5];
    float[] medias = new float[5];
    //Populando a lista de alunos
    for(int i=0;i<matriculas.length;){
      int matricula = leNumeroInt("Digite a matrícula do aluno "+(i+1));
      boolean retorno = matriculaNova(matriculas,matricula);
      if(retorno){
        matriculas[i] = matricula;
        i++;
      }
    }
    //Lendo as notas, calculando e armazenando as médias
    for(int i=0;i<matriculas.length;i++){
      float soma = 0;
      System.out.println("Informe as notas do aluno "+matriculas[i]);
      for(int j=0;j<3;j++){
        soma+=leNumeroFloat("Qual a "+(j+1)+"º nota");
      }
      medias[i] = soma/3;
    }
    //Mostrar os resultados
    for(int i=0;i< matriculas.length;i++){
      System.out.println("O aluno "+matriculas[i]+" tem média "+String.format("%.2f",medias[i]));
    }
  }
}
