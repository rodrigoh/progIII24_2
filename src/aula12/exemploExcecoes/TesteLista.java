package aula12.exemploExcecoes;

public class TesteLista {
  public static void main(String[] args) {
    Lista lista = new Lista(10);
    lista.adiciona("Jonas");
    lista.adiciona("Betina");
    lista.adiciona("Joselito");
    lista.adiciona("Joaquim");
    try {
      System.out.println("Elemento da posição 1 " + lista.obterElemento(1));
      System.out.println("Elemento da posição 10 " + lista.obterElemento(10));
    }
    catch (Exception e){
      System.out.println("Posição informada não existe na lista");
    }
  }
}
