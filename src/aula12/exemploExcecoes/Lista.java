package aula12.exemploExcecoes;

public class Lista {
  private String[] elementos;
  private int tamanho;

  public Lista(int capacidade){
    elementos = new String[capacidade];
    tamanho = 0;
  }

  public void adiciona(String elemento){
    elementos[tamanho] = elemento;
    tamanho++;
  }

  public String obterElemento(int posicao){
    if(posicao<0 || posicao>=tamanho){
      throw new IllegalArgumentException(posicao+" não é uma posição válida para lista");
    }
    return elementos[posicao];
  }
}
