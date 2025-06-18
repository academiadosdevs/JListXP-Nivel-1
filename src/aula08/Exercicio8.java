package aula08;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-08-08
 */
public class Exercicio8 {
  public static void main(String[] args) {
    String entradaMinimo = JOptionPane.showInputDialog("Digite o valor mínimo:");
    int minimo = Integer.parseInt(entradaMinimo);

    String entradaMaximo = JOptionPane.showInputDialog("Digite o valor máximo:");
    int maximo = Integer.parseInt(entradaMaximo);

    int numeroAleatorio = (int) (Math.random() * (maximo - minimo + 1)) + minimo;

    JOptionPane.showMessageDialog(null, "Número sorteado: " + numeroAleatorio);
  }
}