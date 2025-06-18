package aula09;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-09-05
 */
public class Exercicio5 {
  public static void main(String[] args) {
    String personagem = JOptionPane.showInputDialog("Digite o nome de um personagem:");

    boolean ehDiferenteDeGoku = !personagem.equals("Goku");

    JOptionPane.showMessageDialog(null, "O nome é diferente de 'Goku'? " + ehDiferenteDeGoku);
  }
}