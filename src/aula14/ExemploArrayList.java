package aula14;

import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		lista.add("A");
		lista.add("B");
		lista.add("C");
		lista.add("D");
		lista.add("B");
		System.out.println("A lista contém um A "+lista.contains("A"));
		System.out.println(lista);
		lista.add(2,"T");
		System.out.println(lista);
		System.out.println("Posição do B "+lista.indexOf("B"));
		System.out.println("Última posição do B "+lista.lastIndexOf("B"));

		List<Integer> l1 = new ArrayList<>();
	}
}
