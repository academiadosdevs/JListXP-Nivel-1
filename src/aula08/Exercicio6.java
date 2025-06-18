package aula08;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-08-06
 */
public class Exercicio6 {
  public static void main(String[] args) {
    int numeroSorteado = (int) (Math.random() * 100);
    String mensagem = String.format(
      "Parabéns! Você ganhou um vale-coffee número %d!",
      numeroSorteado
    );
    JOptionPane.showMessageDialog(null, mensagem);
  }
}