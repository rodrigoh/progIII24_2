package aula13.exemploAbstrato;

public class Triangulo extends Figura{
	private double base;
	private double altura;
	private double hipotenusa;

	public Triangulo(){
		setNomeFigura("Triângulo");
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getHipotenusa() {
		return hipotenusa;
	}

	public void setHipotenusa(double hipotenusa) {
		this.hipotenusa = hipotenusa;
	}

	@Override
	public double calculaArea() {
		return (base*altura)/2;
	}

	@Override
	public double calculaPerimetro() {
		return base+altura+hipotenusa;
	}
}
