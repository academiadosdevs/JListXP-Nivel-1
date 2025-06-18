package aula08;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-08-04
 */
public class Exercicio4 {
  public static void main(String[] args) {
    int numero1 = (int) (Math.random() * 100) + 1;
    int numero2 = (int) (Math.random() * 100) + 1;

    int diferenca = Math.abs(numero1 - numero2);

    String mensagem = String.format(
      "Número 1: %d\nNúmero 2: %d\nDiferença: %d",
      numero1,
      numero2,
      diferenca
    );
    JOptionPane.showMessageDialog(null, mensagem);
  }
}