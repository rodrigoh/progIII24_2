package aula14;

import aula11.revisao.Pessoa;

public class Teste {
	public static void main(String[] args) {
		Lista<String> l1 = new Lista<>(5);
		Lista<Integer> l2 = new Lista<>(2);
		Lista<Float> l3 = new Lista<>(10);
		Lista<Pessoa> l4 = new Lista<>(5);
		l1.adiciona("A");
		l1.adiciona("C");
		l1.adiciona("D");
		System.out.println(l1);
		l1.adiciona(1,"B");
		System.out.println(l1);
		System.out.println("Removendo o elemento "+l1.remove(2));
		System.out.println(l1);
		l1.adiciona("D");
		l1.adiciona("E");
		l1.adiciona("F");
		l1.adiciona("G");
		System.out.println(l1);
		System.out.println("A posição do elemento G na lista é "+l1.posicaoDe("G"));
		System.out.println("A posição do elemento T na lista é "+l1.posicaoDe("T"));
		System.out.println("A posição do elemento D na lista é "+l1.posicaoDe("D"));
		System.out.println("A última posição de elemento na lista é "+l1.ultimaPosicaoDe("D"));
		l1.limpar();
		System.out.println(l1);

	}
}
