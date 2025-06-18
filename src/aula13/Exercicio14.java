package aula13;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-13-14
 */
public class Exercicio14 {
  public static void main(String[] args) {
    String[] comidas = { "Pizza", "Hambúrguer", "Sushi", "Lasanha", "Churrasco" };
    String menu = "Qual comida você deseja?\n";

    for (int i = 0; i < comidas.length; i++) {
      menu += (i + 1) + ". " + comidas[i] + "\n";
    }

    String entrada = JOptionPane.showInputDialog(menu);
    int escolha = Integer.parseInt(entrada) - 1; // -1 para ajustar ao índice do array

    if (escolha >= 0 && escolha < comidas.length) {
      JOptionPane.showMessageDialog(null, "Ótima escolha! Você pediu " + comidas[escolha] + ".");
    } else {
      JOptionPane.showMessageDialog(null, "Opção inválida!");
    }
  }
}