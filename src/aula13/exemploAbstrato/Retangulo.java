package aula13.exemploAbstrato;

public class Retangulo extends Figura{
	private double altura;
	private double base;

	public Retangulo() {
		setNomeFigura("Retângulo");
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public double calculaArea() {
		return base*altura;
	}

	@Override
	public double calculaPerimetro() {
		return (base+altura)*2;
	}
}
