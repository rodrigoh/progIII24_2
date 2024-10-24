package aula11.revisao;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private int altura;

	public Pessoa(String nome, String sobrenome, int altura) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
}
