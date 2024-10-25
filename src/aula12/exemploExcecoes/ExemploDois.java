package aula12.exemploExcecoes;

public class ExemploDois {
  public static void main(String[] args) {
    Matematica m1 = new Matematica();
    try{
      float r = m1.divide(2,1);
      System.out.println(r);
    }
    catch (ArithmeticException e){
      System.out.println(e.getMessage());
    }
  }
}
