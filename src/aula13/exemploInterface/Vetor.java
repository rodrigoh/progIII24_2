package aula13.exemploInterface;

public class Vetor implements Lista {
	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade){
		elementos = new String[capacidade];
		tamanho = 0;
	}
	@Override
	public void adiciona(String elemento) {
		elementos[tamanho++] = elemento;
	}

	@Override
	public String remove() {
		return elementos[--tamanho];
	}

	public int obterTamanho() {
		return tamanho;
	}
}
