package aula12.exercicios.banco;

import java.util.Random;

public class Conta {
  private String identificador;
  private String titular;
  private String senha;
  protected double saldo;

  public Conta(String titular, String senha){
    this.titular = titular;
    this.senha = senha;
    identificador = geraIdentificador();
    saldo = 0;
  }

  private String geraIdentificador(){
    Random aleatorio = new Random();
    return "conta"+aleatorio.nextInt(1000,10000);
  }


  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public String getIdentificador() {
    return identificador;
  }

  public void depositar(float valor){
    saldo+=valor;
  }

  public boolean sacar(float valor){
    if(saldo>=valor){
      saldo-=valor;
      return true;
    }
    return false;
  }

  public boolean validaAcesso(String identificador, String senha){
    return this.identificador.equals(identificador) && this.senha.equals(senha);
  }

  public String verificaSaldo(){
    return String.format("Seu saldo é de R$ %.2f",saldo);
  }
}
