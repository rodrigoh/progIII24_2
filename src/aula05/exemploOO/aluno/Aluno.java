package aula05.exemploOO.aluno;

public class Aluno {
	String nome;
	String matricula;
	String curso;
	float[] notas;
	int faltas;
	Aluno(){

	}
	Aluno(String nome, String matricula, String curso){
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}

	Aluno(String nome, String matricula){
		this.nome = nome;
		this.matricula = matricula;
	}

	String obterFaltas(){
		return "O aluno "+nome+" tem "+faltas+" faltas";
	}

	void preencherNotas(float[] avaliacoes){
		notas = avaliacoes;
	}

	float calculaMedia(){
		float soma = 0;
		for(int i=0;i< notas.length;i++){
			soma+=notas[i];
		}
		return soma/notas.length;
	}

	String verificaStatus(){
		float media = calculaMedia();
		if(media>=8 && faltas<5)
			return "aprovado";
		else
			return "em recuperação";
	}

}
