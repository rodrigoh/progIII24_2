package aula05.exercicios;

public class Exercicio10 {
  public static void main(String[] args) {
    int[][] matriz = {{3,5,6},{5,2,4},{6,4,8}};
    boolean eSimetrica = true;
    for(int l=0;l<matriz.length;l++){
      for(int c=0;c<matriz[l].length;c++){
        if(matriz[l][c]!=matriz[c][l])
          eSimetrica = false;
      }
    }
    if(eSimetrica)
      System.out.println("A matriz é simétrica");
    else
      System.out.println("A matriz não é simétrica");
  }
}
