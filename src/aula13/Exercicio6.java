package aula13;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-13-06
 */
public class Exercicio6 {
  public static void main(String[] args) {
    float[] valores = new float[8];

    // Pede os 8 valores
    for (int i = 0; i < valores.length; i++) {
      String entrada = JOptionPane.showInputDialog("Digite o valor da posição " + i + ":");
      valores[i] = Float.parseFloat(entrada);
    }

    // Exibe cada posição
    String resultado = "";
    for (int i = 0; i < valores.length; i++) {
      resultado += "Array[" + i + "] = " + valores[i] + "\n";
    }
    JOptionPane.showMessageDialog(null, resultado);
  }
}