package aula13;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-13-07
 */
public class Exercicio7 {
  public static void main(String[] args) {
    float[] valores = new float[8];
    float soma = 0;

    for (int i = 0; i < valores.length; i++) {
      String entrada = JOptionPane.showInputDialog("Digite o valor da posição " + i + ":");
      valores[i] = Float.parseFloat(entrada);
      soma += valores[i];
    }

    JOptionPane.showMessageDialog(null, "Resultado da soma = " + soma);
  }
}