package aula08;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-08-09
 */
public class Exercicio9 {
  public static void main(String[] args) {
    String entradaForca = JOptionPane.showInputDialog("Digite seu valor de força:");
    int forca = Integer.parseInt(entradaForca);

    int dado = (int) (Math.random() * 6) + 1;
    int danoCausado = forca + dado;

    String mensagem = String.format(
      "Você tirou %d no dado.\nDano causado: %d",
      dado,
      danoCausado
    );
    JOptionPane.showMessageDialog(null, mensagem);
  }
}