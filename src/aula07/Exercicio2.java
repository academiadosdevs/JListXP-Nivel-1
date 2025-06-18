package aula07;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-07-02
 */
public class Exercicio2 {
  public static void main(String[] args) {
    String entrada = JOptionPane.showInputDialog("Digite o total gasto com streamings por mês:");
    float totalMes = Float.parseFloat(entrada);

    float resultado = totalMes * 12;
    JOptionPane.showMessageDialog(null, String.format("Você gasta R$%.2f por ano", resultado));
  }
}
