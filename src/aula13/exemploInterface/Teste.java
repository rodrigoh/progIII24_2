package aula13.exemploInterface;

public class Teste {
	public static void main(String[] args) {
		Vetor v1 = new Vetor(20);
		v1.adiciona("A");
		v1.adiciona("B");
		v1.adiciona("C");
		v1.adiciona("D");
		System.out.println(v1.obterTamanho());
		System.out.println(v1.remove());
		System.out.println(v1.obterTamanho());

		Lista compras = new Vetor(5);

		compras.adiciona("Mouse");
		compras.adiciona("Teclado");
		System.out.println(compras.remove());
		//O método obterTamanho não é comum a interface Lista e a classe Vetor, logo não está disponível na instância
		//compras.obterTamanho();

	}
}
