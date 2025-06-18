package aula10;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-10-11
 */
public class Exercicio11 {
  public static void main(String[] args) {
    String entrada = JOptionPane.showInputDialog("Quantos pacotes de miojo você quer comprar?");
    int quantidade = Integer.parseInt(entrada);

    double precoUnitario;
    if (quantidade < 10) {
      precoUnitario = 1.50;
    } else {
      precoUnitario = 1.20;
    }

    double valorTotal = quantidade * precoUnitario;

    JOptionPane.showMessageDialog(null, String.format(
        "Valor por pacote: R$ %.2f\n" +
        "Valor total da compra: R$ %.2f",
        precoUnitario, valorTotal));
  }
}