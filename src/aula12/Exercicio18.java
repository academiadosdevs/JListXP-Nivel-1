package aula12;

/**
 * ID do exercício: XP1-12-18
 */
public class Exercicio18 {
  public static void main(String[] args) {
    int numero;
    do {
      numero = 1 + (int) (Math.random() * 4); // 1 a 4
      System.out.println("Número gerado: " + numero);
    } while (numero != 3);

    System.out.println("Finalmente! O número 3 foi gerado.");
  }
}