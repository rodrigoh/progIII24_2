package aula12.exemploFinal;

public class Matematica {
  public final double pi;
  //public -> para ter acesso global
  //static -> para existir independente
  //final -> não ter o valor alterado
  public static final double PI = 3.141592653589793;

  public Matematica(){
    pi = 3.14;
  }
}
