package aula12.exemploHeranca;

public class Colaborador {
  private String nome;
  private String sobrenome;
  private String matricula;

  public Colaborador(String nome, String sobrenome, String matricula){
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.matricula = matricula;
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

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }
  //Métodos finais não podem ser sobrescritos nas subclasses
  public final String obterDados(){
    return "Nome: "+nome+" "+sobrenome+" Matrícula: "+matricula;
  }

  @Override
  public String toString(){
    return "Nome: "+nome+" "+sobrenome+" Matrícula: "+matricula;
  }
}
