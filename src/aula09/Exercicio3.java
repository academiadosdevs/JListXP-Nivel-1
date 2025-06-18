package aula09;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-09-03
 */
public class Exercicio3 {
  public static void main(String[] args) {
    String entrada1 = JOptionPane.showInputDialog("Digite a primeira nota:");
    double nota1 = Double.parseDouble(entrada1);

    String entrada2 = JOptionPane.showInputDialog("Digite a segunda nota:");
    double nota2 = Double.parseDouble(entrada2);

    boolean saoIguais = nota1 == nota2;

    JOptionPane.showMessageDialog(null, "As notas são exatamente iguais? " + saoIguais);
  }
}