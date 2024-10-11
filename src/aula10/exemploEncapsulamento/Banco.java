package aula10.exemploEncapsulamento;

public class Banco {
  public static void main(String[] args) {
    Conta c1 = new Conta("Fulano",100);
    System.out.println(c1.verificaSaldo());
    System.out.println("Identificador: "+c1.getIdentificador());
    //Deixar o atributo saldo como privado, impede essa modificação direta
    //c1.saldo = -1;
    //c1.identificador = "id10";
    System.out.println(c1.verificaSaldo());
    System.out.println("Identificador: "+c1.getIdentificador());
    c1.setTitular("Fabio");
    //Saldo = privado acessível apenas por depositar (alterar), sacar (alterar), verificaSaldo (ler) e getSaldo (ler)
    //c1.saldo = valor

    //privado acessível por meio do getIdentificador (ler)
    //c1.identificador = "valor";

    //Com o método geraIdentificador como private, não é possível chamar ele externamente
    //c1.geraIdentificador();
    System.out.println(c1.verificaSaldo());
    System.out.println("Identificador: "+c1.getIdentificador());

  }
}
