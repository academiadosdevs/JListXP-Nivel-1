package aula09;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-09-06
 */
public class Exercicio6 {
  public static void main(String[] args) {
    String entradaAssistidos = JOptionPane.showInputDialog("Episódios assistidos:");
    int assistidos = Integer.parseInt(entradaAssistidos);

    String entradaTotal = JOptionPane.showInputDialog("Total de episódios da série:");
    int total = Integer.parseInt(entradaTotal);

    boolean finalizouSerie = assistidos >= total;

    JOptionPane.showMessageDialog(null, "Você já finalizou esta série? " + finalizouSerie);
  }
}