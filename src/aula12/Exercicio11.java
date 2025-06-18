package aula12;

/**
 * ID do exercício: XP1-12-11
 */
public class Exercicio11 {
  public static void main(String[] args) {
    System.out.println("Gerando 3 números aleatórios (100-999) divisíveis por 5:");
    int contador = 0;
    while (contador < 3) {
      int numero = 100 + (int) (Math.random() * 900); // 100 a 999
      if (numero % 5 == 0) {
        System.out.println(numero);
        contador++;
      }
    }
  }
}