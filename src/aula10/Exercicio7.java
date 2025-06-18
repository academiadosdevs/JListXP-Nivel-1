package aula10;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-10-07
 */
public class Exercicio7 {
  public static void main(String[] args) {
    String entrada = JOptionPane.showInputDialog("Escolha 0 (pedra), 1 (papel) ou 2 (tesoura):");
    int jogador = Integer.parseInt(entrada);
    int computador = (int) (Math.random() * 3); // 0, 1 ou 2

    String[] opcoes = { "Pedra", "Papel", "Tesoura" };

    String resultado;
    if (jogador == computador) {
      resultado = "Empate!";
    } else if ((jogador == 0 && computador == 2) || (jogador == 1 && computador == 0)
        || (jogador == 2 && computador == 1)) {
      resultado = "Você ganhou!";
    } else {
      resultado = "Você perdeu!";
    }

    JOptionPane.showMessageDialog(null, String.format(
        "Você jogou: %s\n" +
        "O computador jogou: %s\n\n" +
        "%s",
        opcoes[jogador], opcoes[computador], resultado));
  }
}