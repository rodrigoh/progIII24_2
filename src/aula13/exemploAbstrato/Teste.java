package aula13.exemploAbstrato;

public class Teste {
	public static void main(String[] args) {
		Retangulo r1 = new Retangulo();
		r1.setBase(5);
		r1.setAltura(2);
		double area = r1.calculaArea();
		System.out.println(r1);

		Circulo c1 = new Circulo();
		c1.setRaio(5);
		System.out.println(c1);
	}
}
