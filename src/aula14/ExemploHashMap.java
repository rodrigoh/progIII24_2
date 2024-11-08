package aula14;

import java.util.HashMap;

public class ExemploHashMap {
	public static void main(String[] args) {
		HashMap<String, String> estados = new HashMap<>();

		estados.put("RS","Rio Grande do Sul");
		estados.put("SC", "Santa Catarina");
		System.out.println(estados);
//		estados.put("SC", "Santa");
//		System.out.println(estados);
		estados.put("PR","Paraná");
		estados.put("RJ","Rio de Janeiro");
		estados.put("SP", "São Paulo");
		System.out.println(estados);
		System.out.println(estados.keySet());
		System.out.println(estados.values());
		System.out.println(estados.get("RS"));
		System.out.println("Contém "+estados.containsKey("RJ"));
		System.out.println(estados.remove("SC"));
	}
}
