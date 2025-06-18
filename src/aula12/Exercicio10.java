package aula12;

/**
 * ID do exercício: XP1-12-10
 */
public class Exercicio10 {
  public static void main(String[] args) {
    System.out.println("Gerando 10 números aleatórios entre 0 e 100:");
    for (int i = 0; i < 10; i++) {
      int numero = (int) (Math.random() * 101);
      System.out.println(numero);
    }
  }
}