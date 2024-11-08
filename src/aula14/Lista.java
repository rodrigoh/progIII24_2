package aula14;

import java.io.ObjectInput;

public class Lista<T> {
	private T[] elementos;
	private int tamanho;
	//Adicionar ok
	//Adicionar em qualquer posição ok
	//Remover ok
	//Tamanho ok
	//contém ok
	//posiçãoDe ok
	//ultimaPosicaoDe ok
	//toString ok

	public Lista(int capacidade){
		elementos = (T[]) new Object[capacidade];
		tamanho = 0;
	}

	public void adiciona(T elemento){
		aumentaCapacidade();
		elementos[tamanho] = elemento;
		tamanho++;
	}
	public void adiciona(int posicao, T elemento){
		if(posicao<0 || posicao>=tamanho)
			throw new IllegalArgumentException("posição "+posicao+" é inválida");
		aumentaCapacidade();
		//Deslocar os elementos
		for(int i=tamanho-1;i>=posicao;i--){
			elementos[i+1] = elementos[i];
		}
		elementos[posicao] = elemento;
		tamanho++;
	}

	private void aumentaCapacidade(){
		if(tamanho == elementos.length){
			T[] aux = (T[]) new Object[tamanho*2];
			for(int i=0;i<tamanho;i++){
				aux[i] = elementos[i];
			}
			//System.arraycopy(elementos, 0, aux, 0, tamanho);
			elementos = aux;
		}
	}

	public void limpar(){
		tamanho =0;
	}

	public boolean estaVazia(){
		return tamanho==0;
	}

	public int ultimaPosicaoDe(T elemento){
		int posicao = -1;
		for(int i=0;i<tamanho;i++){
			if(elementos[i].equals(elemento)){
				posicao = i;
			}
		}
		return posicao;
	}

	public int posicaoDe(T elemento){
		for(int i =0; i<tamanho;i++){
			if(elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}

	public int tamanho(){
		return tamanho;
	}

	public boolean contem(T elemento){
		return posicaoDe(elemento)!=-1;
	}

	public T remove(int posicao){
		if(posicao<0 || posicao>=tamanho)
			throw new IllegalArgumentException("posição "+posicao+" é inválida");
		T copia = elementos[posicao];
		for(int i=posicao;i<tamanho-1;i++){
			elementos[i] = elementos[i+1];
		}
		tamanho--;
		return copia;
	}
	//[A,B,D,E]
	//[1,2,3,4,5]
	@Override
	public String toString(){
		String retorno = "[";
		if(tamanho>0){
			for(int i=0;i<tamanho-1;i++){
				retorno+=elementos[i]+", ";
			}
			retorno+=elementos[tamanho-1];
		}
		retorno+="]";
		return retorno;
	}
}
