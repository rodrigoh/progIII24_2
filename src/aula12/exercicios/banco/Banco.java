package aula12.exercicios.banco;

import java.util.Scanner;

public class Banco {

  public static String leString(String mensagem){
    System.out.print(mensagem+": ");
    return new Scanner(System.in).nextLine();
  }

  public static int leInt(String mensagem){
    System.out.print(mensagem+": ");
    return new Scanner(System.in).nextInt();
  }

  public static float lerFloat(String mensagem){
    System.out.print(mensagem+": ");
    return new Scanner(System.in).nextFloat();
  }

  public static Conta cadastraConta(){
    String titular = leString("Qual o nome do titular: ");
    String senha = leString("Qual a senha: ");
    Conta c1 = new Conta(titular,senha);
    System.out.println("Conta cadastrada obteve o identificador "+c1.getIdentificador());
    return c1;
  }

  public static ContaCorrente cadastraContaCorrente(){
    String titular = leString("Qual o nome do titular");
    String senha = leString("Qual a senha");
    float limite = lerFloat("Qual o limite inicial do "+titular);
    ContaCorrente c1 = new ContaCorrente(titular,senha,limite);
    System.out.println("Conta cadastrada obteve o identificador "+c1.getIdentificador());
    return c1;
  }

  public static Conta acessaConta(Conta c1){
    String opc;
    do{
      System.out.println("Acessando a conta "+c1.getIdentificador());
      System.out.println("Selecione uma opção");
      System.out.println("d - depositar");
      System.out.println("s - sacar");
      System.out.println("v - verificar saldo");
      System.out.println("e - sair");
      opc = leString("").toLowerCase();
      switch (opc){
        case "d"->{
          float valor = lerFloat("Qual valor deseja depositar");
          c1.depositar(valor);
          System.out.println("Depósito realizado");
        }
        case "s"->{
          float valor = lerFloat("Qual valor deseja sacar");
          if(c1.sacar(valor))
            System.out.println("Saque realizado");
          else
            System.out.println("Saldo insuficiente");
        }
        case "v"-> System.out.println(c1.verificaSaldo());
      }
    }
    while (!opc.equals("e"));
    return c1;
  }

  public static ContaCorrente acessaContaCorrente(ContaCorrente c1){
    String opc;
    do{
      System.out.println("Acessando a conta "+c1.getIdentificador());
      System.out.println("Selecione uma opção");
      System.out.println("d - depositar");
      System.out.println("s - sacar");
      System.out.println("v - verificar saldo");
      System.out.println("e - sair");
      opc = leString("").toLowerCase();
      switch (opc){
        case "d"->{
          float valor = lerFloat("Qual valor deseja depositar");
          c1.depositar(valor);
          System.out.println("Depósito realizado");
        }
        case "s"->{
          float valor = lerFloat("Qual valor deseja sacar");
          if(c1.sacar(valor))
            System.out.println("Saque realizado");
          else
            System.out.println("Saldo insuficiente");
        }
        case "v"-> System.out.println(c1.verificaSaldo());
      }
    }
    while (!opc.equals("e"));
    return c1;
  }

  public static void main(String[] args) {
    Conta[] listaCP = new Conta[100];
    ContaCorrente[] listaCC = new ContaCorrente[100];
    int contCP = 0;
    int contCC = 0;

    String opc;
    do{
      System.out.println("Bem vindo ao Banco");
      System.out.println("Selecione uma opção");
      System.out.println("cp - criar uma conta poupança");
      System.out.println("cc - criar uma conta corrente");
      System.out.println("a - acessar uma conta");
      System.out.println("s - sair");

      opc = leString("").toLowerCase();
      switch (opc){
        case "cp"->{
          if(contCP<100) {
            listaCP[contCP] = cadastraConta();
            contCP++;
          }
          else
            System.out.println("Banco lotado!");
        }
        case "cc"->{
          if(contCP<100) {
            listaCC[contCC] = cadastraContaCorrente();
            contCC++;
          }
          else
            System.out.println("Banco lotado!");
        }
        case "a"->{
          String identificador = leString("Qual o id da conta");
          String senha = leString("Qual a senha: ");
          int poscc = -1;
          int poscp = -1;
          //Busca na lista de conta corrente
          for(int i=0;i<contCC;i++)
            if(listaCC[i].validaAcesso(identificador,senha))
              poscc = i;
          //Busca na lista de conta poupança
          for(int i=0;i<contCP;i++)
            if(listaCP[i].validaAcesso(identificador,senha))
              poscp = i;
          if(poscc>=0)
            listaCC[poscc] = acessaContaCorrente(listaCC[poscc]);
          else if(poscp>=0)
            listaCP[poscp] = acessaConta(listaCP[poscp]);
          else
            System.out.println("Conta não encontrada ou senha inválida");
        }
      }
    }
    while (!opc.equals("s"));
  }
}
