package aula03.exemploDoWhile;

public class Exemplo2 {
  public static void main(String[] args) {
    int valor = 10;
    //Quando o while já inicia com a condição final falsa ele nem executa
    System.out.println("Exemplo com while");
    while(valor<10){
      System.out.print(valor+" ");
      valor++;
    }
    //Quando o do..while inicia com a condição final falsa ele executa uma vez
    System.out.println("Exemplo com do..while");
    do{
      System.out.print(valor+" ");
      valor++;
    }
    while(valor<10);
  }
}
