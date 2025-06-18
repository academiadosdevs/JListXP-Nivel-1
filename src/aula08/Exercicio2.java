package aula08;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-08-02
 */
public class Exercicio2 {
  public static void main(String[] args) {
    double numeroAleatorio = Math.random() * 10;
    int numeroInteiro = (int) numeroAleatorio;
    JOptionPane.showMessageDialog(null, "Número aleatório (0 a 9): " + numeroInteiro);
  }
}