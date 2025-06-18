package aula12;

/**
 * ID do exercício: XP1-12-06
 */
public class Exercicio6 {
  public static void main(String[] args) {
    int soma = 0;
    for (int i = 0; i <= 100; i += 2) {
      soma += i;
    }
    System.out.println("A soma dos números pares entre 0 e 100 é: " + soma);
  }
}