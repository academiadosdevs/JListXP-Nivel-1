package aula06;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-06-09
 */
public class Exercicio9 {
  public static void main(String[] args) {
    String objeto = JOptionPane.showInputDialog("Escolha um objeto");
    String animal = JOptionPane.showInputDialog("Escolha um animal");
    String numero = JOptionPane.showInputDialog("Escolha um número qualquer");
    String resposta = String.format("O Espadachim do %s %s nº %s está pronto para a batalha!", objeto, animal, numero);
    JOptionPane.showMessageDialog(null, resposta);
  }
}
