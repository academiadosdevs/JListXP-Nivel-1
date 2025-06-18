package aula13;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-13-16
 */
public class Exercicio16 {
  public static void main(String[] args) {
    int[] numeros = new int[8];
    int contadorPositivos = 0;

    for (int i = 0; i < numeros.length; i++) {
      String entrada = JOptionPane.showInputDialog("Digite o número da posição " + i + ":");
      numeros[i] = Integer.parseInt(entrada);
      if (numeros[i] > 0) {
        contadorPositivos++;
      }
    }

    JOptionPane.showMessageDialog(null, "Total de números positivos digitados: " + contadorPositivos);
  }
}