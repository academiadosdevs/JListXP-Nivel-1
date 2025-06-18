package aula13;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-13-22
 */
public class Exercicio22 {
  public static void main(String[] args) {
    String entradaPosicoes = JOptionPane.showInputDialog("Quantas posições o array terá?");
    int n = Integer.parseInt(entradaPosicoes);

    double[] valores = new double[n];
    double soma = 0;

    for (int i = 0; i < valores.length; i++) {
      String entrada = JOptionPane.showInputDialog("Digite o valor da posição " + i + ":");
      valores[i] = Double.parseDouble(entrada);
      soma += valores[i];
    }

    double media = soma / valores.length;
    JOptionPane.showMessageDialog(null, "A média de todos os valores é: " + media);
  }
}