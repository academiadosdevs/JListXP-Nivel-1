package aula13;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-13-08
 */
public class Exercicio8 {
  public static void main(String[] args) {
    float[] valores = new float[8];
    float somaImpares = 0;

    for (int i = 0; i < valores.length; i++) {
      String entrada = JOptionPane.showInputDialog("Digite o valor da posição " + i + ":");
      valores[i] = Float.parseFloat(entrada);
      if (valores[i] % 2 != 0) {
        somaImpares += valores[i];
      }
    }

    JOptionPane.showMessageDialog(null, "Soma dos valores ímpares = " + somaImpares);
  }
}