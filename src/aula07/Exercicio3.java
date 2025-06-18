package aula07;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-07-03
 */
public class Exercicio3 {
  public static void main(String[] args) {
    double valorCamisa = 49.9;
    int unidades = 3;

    String mensagem = String.format("Total da compra é R$%.2f", (valorCamisa * unidades));
    JOptionPane.showMessageDialog(null, mensagem);
  }
}
