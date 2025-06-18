package aula13;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-13-10
 */
public class Exercicio10 {
  public static void main(String[] args) {
    int[] numeros = new int[6];
    String maioresQue20 = "Valores maiores que 20:\n";

    for (int i = 0; i < numeros.length; i++) {
      String entrada = JOptionPane.showInputDialog("Digite o valor da posição " + i + ":");
      numeros[i] = Integer.parseInt(entrada);
    }

    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] > 20) {
        maioresQue20 += numeros[i] + "\n";
      }
    }
    JOptionPane.showMessageDialog(null, maioresQue20);
  }
}