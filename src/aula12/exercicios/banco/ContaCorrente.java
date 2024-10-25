package aula12.exercicios.banco;

public class ContaCorrente extends Conta{
  private float limite;

  public ContaCorrente(String titular, String senha, float limite){
    super(titular, senha);
    this.limite = limite;
  }

  public float getLimite() {
    return limite;
  }

  public void setLimite(float limite) {
    this.limite = limite;
  }

  @Override
  public boolean sacar(float valor){
    if(saldo+limite>=valor){
      saldo-=valor;
      return true;
    }
    return false;
  }

  @Override
  public String verificaSaldo(){
    String extrato = "Seu saldo é de "+String.format("%.2f",saldo);
    if(saldo<0)
      extrato+="Limite disponível "+String.format("%.2f",saldo+limite);
    else
      extrato+="Limite disponível "+String.format("%.2f",limite);
    return extrato;
  }
}
