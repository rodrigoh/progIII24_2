package aula14;

import java.util.HashSet;

public class ExemploHashSet {
	public static void main(String[] args) {
		HashSet<String> compras = new HashSet<>();
		System.out.println(compras.add("Leite"));
		System.out.println(compras.add("Pão"));
		System.out.println(compras.add("Leite"));
		System.out.println(compras);
	}
}
