package aula03.exemploFor;

public class Exemplo {
  public static void main(String[] args) {
    //for(declaração* e/ou inicialização;teste(s);passo)
    //* se declarar a variável dentro do for, ela só existe no contexto do for
    System.out.println("Exemplo 1:");
    for(int cont=0;cont<10;cont++)
      System.out.print(cont+" ");
    //Criando um for para decrementar uma variável
    System.out.println("\nExemplo 2:");
    for(int i=9;i>=0;i--)
      System.out.print(i+" ");
    //For com passo 2
    System.out.println("\nExemplo de for com passo 2");
    for(int i=0;i<20;i+=2)
      System.out.print(i+" ");
    //Removendo o incremento
    System.out.println("\nFor usando um incremento 'externo':");
    for(int i=0;i<10;){
      System.out.print(i+" ");
      i++;
    }
    //Remover a inicialização
    System.out.println("\nO for pode ser criado usando uma variável já existente");
    int i=5;
    for(;i<20;i++)
      System.out.print(i+" ");
    //For com vários índices
    System.out.println("\nUsando o for com duas variáveis");
    for(int x=0, t=9;x<10 && t>=0;x++,t--){
      System.out.println("x="+x+", t="+t);
    }
  }
}
