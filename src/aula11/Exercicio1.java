package aula11;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-11-01
 */
public class Exercicio1 {
  public static void main(String[] args) {
    String entrada = JOptionPane.showInputDialog("Digite um número de 1 a 7:");
    int dia = Integer.parseInt(entrada);
    String nomeDoDia;

    switch (dia) {
      case 1:
        nomeDoDia = "Domingo";
        break;
      case 2:
        nomeDoDia = "Segunda-feira";
        break;
      case 3:
        nomeDoDia = "Terça-feira";
        break;
      case 4:
        nomeDoDia = "Quarta-feira";
        break;
      case 5:
        nomeDoDia = "Quinta-feira";
        break;
      case 6:
        nomeDoDia = "Sexta-feira";
        break;
      case 7:
        nomeDoDia = "Sábado";
        break;
      default:
        nomeDoDia = "Dia inválido!";
        break;
    }
    JOptionPane.showMessageDialog(null, nomeDoDia);
  }
}