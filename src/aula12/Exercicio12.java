package aula12;

/**
 * ID do exercício: XP1-12-12
 */
public class Exercicio12 {
  public static void main(String[] args) {
    int pares = 0;
    System.out.println("Números gerados (0 a 50):");
    for (int i = 0; i < 20; i++) {
      int numero = (int) (Math.random() * 51);
      System.out.print(numero + " ");
      if (numero % 2 == 0) {
        pares++;
      }
    }
    System.out.println("\n\nTotal de números pares: " + pares);
  }
}