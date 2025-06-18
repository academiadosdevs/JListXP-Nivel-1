package aula06;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-06-08
 */
public class Exercicio8 {
  public static void main(String[] args) {
    String nomeRobo = JOptionPane.showInputDialog("Qual seria o nome perfeito para um robô programador?");
    String resposta = String.format("O robô %s está pronto para codar 24h por dia!", nomeRobo);
    JOptionPane.showMessageDialog(null, resposta);
  }
}
