package aula13.exemploAbstrato;

public class Circulo extends Figura{
	private double raio;

	public Circulo(){
		setNomeFigura("Círculo");
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		return Math.PI*raio*raio;
	}

	@Override
	public double calculaPerimetro() {
		return Math.PI*2*raio;
	}
}
