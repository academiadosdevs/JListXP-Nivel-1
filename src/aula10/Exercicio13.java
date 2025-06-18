package aula10;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-10-13
 */
public class Exercicio13 {
  public static void main(String[] args) {
    // Solução para o desafio bônus (sem usar if), pois é mais elegante
    // e usa apenas conceitos já vistos (divisão e resto).

    String entradaProduto = JOptionPane.showInputDialog("Valor do produto:");
    int valorProduto = Integer.parseInt(entradaProduto);

    String entradaPago = JOptionPane.showInputDialog("Valor pago:");
    int valorPago = Integer.parseInt(entradaPago);

    int troco = valorPago - valorProduto;
    String resultado = "Troco: R$ " + troco + "\n\n";

    // Calcula as notas de R$ 50
    int notas50 = troco / 50;
    troco %= 50; // Atualiza o troco com o que sobrou

    // Calcula as notas de R$ 20
    int notas20 = troco / 20;
    troco %= 20;

    // Calcula as notas de R$ 10
    int notas10 = troco / 10;
    troco %= 10;

    // Calcula as notas de R$ 5
    int notas5 = troco / 5;
    troco %= 5;

    // Calcula as notas de R$ 2
    int notas2 = troco / 2;
    troco %= 2;

    // O que sobra são moedas de R$ 1
    int moedas1 = troco;

    // Monta a string de resultado apenas para as notas/moedas usadas
    if (notas50 > 0) resultado += notas50 + " nota(s) de R$ 50\n";
    if (notas20 > 0) resultado += notas20 + " nota(s) de R$ 20\n";
    if (notas10 > 0) resultado += notas10 + " nota(s) de R$ 10\n";
    if (notas5 > 0) resultado += notas5 + " nota(s) de R$ 5\n";
    if (notas2 > 0) resultado += notas2 + " nota(s) de R$ 2\n";
    if (moedas1 > 0) resultado += moedas1 + " moeda(s) de R$ 1\n";

    JOptionPane.showMessageDialog(null, resultado);
  }
}