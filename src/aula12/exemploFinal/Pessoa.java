package aula12.exemploFinal;

public final class Pessoa {
  private String nome;
  private String sobrenome;
  private Integer altura;

  public Pessoa(){

  }

  public Pessoa(String nome, String sobrenome, Integer altura) {
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

  public Integer getAltura() {
    return altura;
  }

  public void setAltura(Integer altura) {
    this.altura = altura;
  }
}
