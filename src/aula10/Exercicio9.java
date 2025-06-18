package aula10;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-10-09 (Versão adaptada)
 */
public class Exercicio9 {
  public static void main(String[] args) {
    int numeroSorteado = (int) (Math.random() * 101); // 0 a 100

    String entrada = JOptionPane.showInputDialog("Eu pensei em um número de 0 a 100. Tente adivinhar!");
    int palpite = Integer.parseInt(entrada);

    if (palpite == numeroSorteado) {
      JOptionPane.showMessageDialog(null, "Parabéns! Você acertou!");
    } else if (palpite < numeroSorteado) {
      JOptionPane.showMessageDialog(null, "Errado! Seu palpite foi MENOR que o número secreto.");
    } else {
      JOptionPane.showMessageDialog(null, "Errado! Seu palpite foi MAIOR que o número secreto.");
    }
  }
}