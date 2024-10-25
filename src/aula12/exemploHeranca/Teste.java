package aula12.exemploHeranca;

public class Teste {
  public static void main(String[] args) {
    Colaborador c1 = new Colaborador("Jonas", "Silva", "a123");
//    c1.setNome("Jonas");
//    c1.setSobrenome("Silva");
//    c1.setMatricula("a123");
    System.out.println(c1);

    Motorista m1 = new Motorista("Josias", "Santos", "m145", "9438578345");
    m1.setNome("Josias");
    m1.setSobrenome("Santos");
    m1.setCnh("9438578345");
    m1.setMatricula("m145");
    System.out.println(m1);
  }
}
