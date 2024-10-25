package aula12.exemploHeranca;

public class Motorista extends Colaborador{
  private String cnh;

  public Motorista(String nome, String sobrenome, String matricula, String cnh){
    super(nome, sobrenome, matricula);
    this.cnh = cnh;
  }

  public String getCnh() {
    return cnh;
  }

  public void setCnh(String cnh) {
    this.cnh = cnh;
  }

}
