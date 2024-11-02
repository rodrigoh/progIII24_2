package aula13.exemploAbstrato;

public abstract class Figura {
	//Classes abstratas podem ter atributos
	private String nomeFigura;

	public String getNomeFigura() {
		return nomeFigura;
	}

	public void setNomeFigura(String nomeFigura) {
		this.nomeFigura = nomeFigura;
	}

	public abstract double calculaArea();

	public abstract double calculaPerimetro();

	@Override
	public String toString(){
		return "Figura: "+nomeFigura+" área "+calculaArea()+"un² Perímetro "+calculaPerimetro()+"un";
	}
}
