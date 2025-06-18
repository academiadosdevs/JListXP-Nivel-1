package aula10;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-10-02
 */
public class Exercicio2 {
  public static void main(String[] args) {
    String entrada = JOptionPane.showInputDialog("Digite um número de 1 a 12:");
    int mes = Integer.parseInt(entrada);
    String nomeDoMes;

    if (mes == 1) {
      nomeDoMes = "Janeiro";
    } else if (mes == 2) {
      nomeDoMes = "Fevereiro";
    } else if (mes == 3) {
      nomeDoMes = "Março";
    } else if (mes == 4) {
      nomeDoMes = "Abril";
    } else if (mes == 5) {
      nomeDoMes = "Maio";
    } else if (mes == 6) {
      nomeDoMes = "Junho";
    } else if (mes == 7) {
      nomeDoMes = "Julho";
    } else if (mes == 8) {
      nomeDoMes = "Agosto";
    } else if (mes == 9) {
      nomeDoMes = "Setembro";
    } else if (mes == 10) {
      nomeDoMes = "Outubro";
    } else if (mes == 11) {
      nomeDoMes = "Novembro";
    } else if (mes == 12) {
      nomeDoMes = "Dezembro";
    } else {
      nomeDoMes = "Existe esse mês só no multiverso.";
    }
    JOptionPane.showMessageDialog(null, nomeDoMes);
  }
}