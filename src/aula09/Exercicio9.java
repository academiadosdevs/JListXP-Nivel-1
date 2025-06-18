package aula09;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-09-09
 */
public class Exercicio9 {
  public static void main(String[] args) {
    String entrada = JOptionPane.showInputDialog("Digite um número inteiro:");
    int numero = Integer.parseInt(entrada);

    boolean estaNoIntervalo = numero >= 10 && numero < 100;

    JOptionPane.showMessageDialog(null, "O número está entre 10 e 99? " + estaNoIntervalo);
  }
}