package aula10;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-10-01
 */
public class Exercicio1 {
  public static void main(String[] args) {
    String entrada = JOptionPane.showInputDialog("Digite um número de 1 a 7:");
    int dia = Integer.parseInt(entrada);

    if (dia == 1) {
      JOptionPane.showMessageDialog(null, "Domingo");
    } else if (dia == 2) {
      JOptionPane.showMessageDialog(null, "Segunda-feira");
    } else if (dia == 3) {
      JOptionPane.showMessageDialog(null, "Terça-feira");
    } else if (dia == 4) {
      JOptionPane.showMessageDialog(null, "Quarta-feira");
    } else if (dia == 5) {
      JOptionPane.showMessageDialog(null, "Quinta-feira");
    } else if (dia == 6) {
      JOptionPane.showMessageDialog(null, "Sexta-feira");
    } else if (dia == 7) {
      JOptionPane.showMessageDialog(null, "Sábado");
    } else {
      JOptionPane.showMessageDialog(null, "Esse dia não existe no calendário humano.");
    }
  }
}