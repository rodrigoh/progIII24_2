package aula03.exemploIf;

import java.util.Scanner;

public class Exemplo3 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Entre com o nome de usuário: ");
    String usuario = ler.next();
    System.out.print("Entre com a senha do usuário: ");
    String senha = ler.next();
    String usuarioValido = "admin";
    //Para comparar Objetos (String, por exemplo) temos que usar o método equals
    if(usuario.equals(usuarioValido) && senha.equals("a123456")) {
      System.out.println("Bem vindo "+usuario);
    }
    else{
      System.out.println("Usuário ou senha incorretos");
    }
  }
}
