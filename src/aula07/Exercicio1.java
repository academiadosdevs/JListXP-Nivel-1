package aula07;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-07-01
 */
public class Exercicio1 {
  public static void main(String[] args) {
    String entrada = JOptionPane.showInputDialog("Digite o valor do primeiro produto:");
    float precoProdutoA = Float.parseFloat(entrada);

    entrada = JOptionPane.showInputDialog("Digite o valor do segundo produto:");
    float precoProdutoB = Float.parseFloat(entrada);

    float resultado = precoProdutoA + precoProdutoB;
    JOptionPane.showMessageDialog(null,  resultado);
  }
}
