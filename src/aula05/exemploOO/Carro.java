package aula05.exemploOO;

public class Carro {
	String marca;
	String modelo;
	String cor;
	int km;
	int anoFabricacao;
	int velocidade;
	int velocidadeMaxima;
	float capacidadeTanque;
	float litros;

	boolean abastecer(float quantLitros){
		if(capacidadeTanque>litros+quantLitros){
			litros+=quantLitros;
			return true;
		}
		return false;
	}

	void andar(int novaVelocidade){
		if(novaVelocidade<velocidadeMaxima){
			velocidade = novaVelocidade;
		}
	}

	void parar(){
		velocidade = 0;
	}

	String obterVelicidade(){
		return "Sua velocidade atual é de "+velocidade+" km/h";
	}





}
