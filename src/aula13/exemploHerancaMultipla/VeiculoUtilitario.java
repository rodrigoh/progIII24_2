package aula13.exemploHerancaMultipla;

public class VeiculoUtilitario implements VeiculoPasseio, VeiculoCarga{

	@Override
	public boolean carregar() {
		return false;
	}

	@Override
	public void descarregar() {

	}

	@Override
	public boolean embarcaPassageiro() {
		return false;
	}

	@Override
	public void desembarcaPAssageiro() {

	}

	@Override
	public void andar() {

	}

	@Override
	public void parar() {

	}

	@Override
	public int obterVelocidade() {
		return 0;
	}
}
