package aula04.exemplosVetores;

public class Exemplo6 {
	public static void main(String[] args) {
		String[] nomes = {"Ana", "Pedro", "Jonas", "Betina", "João"};
		System.out.println("\nMostrando a lista com for");
		for(int i=0;i<nomes.length;i++){
			System.out.print(nomes[i]+" ");
		}

		System.out.println("\nMostrando a lista com for simplificado");
		for(String nome:nomes){
			System.out.print(nome+" ");
		}
	}
}
