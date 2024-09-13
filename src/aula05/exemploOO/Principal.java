package aula05.exemploOO;

public class Principal {
	public static void main(String[] args) {
		Carro fusca = new Carro();
		Carro fiat500 = new Carro();

		fusca.marca = "vw";
		fusca.modelo = "fusca";
		fusca.anoFabricacao = 1980;
		fusca.cor = "azul";
		fusca.capacidadeTanque = 50;
		fusca.velocidadeMaxima=120;
		fusca.km = 85989;

		fiat500.marca = "fiat";
		fiat500.modelo = "500";
		fiat500.anoFabricacao = 1960;
		fiat500.capacidadeTanque = 40;
		fiat500.velocidadeMaxima = 120;
		fiat500.km = 125258;

		//System.out.println("O modelo do carro é "+fiat500.modelo);

		if(fusca.abastecer(50))
			System.out.println("Veículo abastecido");
		else
			System.out.println("Não foi possível abastecer");
		fusca.andar(100);
		System.out.println(fusca.modelo+" "+fusca.obterVelicidade());



	}
}
