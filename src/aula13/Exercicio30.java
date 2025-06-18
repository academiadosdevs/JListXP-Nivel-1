package aula13;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-13-30
 */
public class Exercicio30 {
  public static void main(String[] args) {
    // --- Vez do Jogador 1 ---
    JOptionPane.showMessageDialog(null, "Jogador 1, prepare o desafio!");
    String tema = JOptionPane.showInputDialog("Escolha um tema (ex: Anime, Filme, Jogo):");
    String resposta = JOptionPane.showInputDialog("Digite a palavra secreta:");
    String[] dicas = new String[5];
    for (int i = 0; i < 5; i++) {
      dicas[i] = JOptionPane.showInputDialog("Digite a dica #" + (i + 1) + ":");
    }

    // Limpa a tela (simulação) e passa para o Jogador 2
    JOptionPane.showMessageDialog(null, "Agora é a vez do Jogador 2! \nO desafio está pronto.");

    // --- Vez do Jogador 2 ---
    int pontuacao = 0;
    boolean acertou = false;

    for (int i = 0; i < 5; i++) {
      String palpite = JOptionPane.showInputDialog(
          "Tema: " + tema + "\n\n" +
              "Dica #" + (i + 1) + ": " + dicas[i] + "\n\n" +
              "Qual é a sua resposta?");

      if (palpite.equalsIgnoreCase(resposta)) {
        acertou = true;
        // Calcula a pontuação com base na tentativa
        switch (i) {
          case 0: pontuacao = 100; break; // Acertou na 1ª dica
          case 1: pontuacao = 60; break;  // Acertou na 2ª dica
          case 2: pontuacao = 40; break;  // Acertou na 3ª dica
          case 3: pontuacao = 20; break;  // Acertou na 4ª dica
          case 4: pontuacao = 10; break;  // Acertou na 5ª dica
        }
        break; // Sai do laço pois o jogador acertou
      } else {
        JOptionPane.showMessageDialog(null, "Resposta errada! Próxima dica...");
      }
    }

    // --- Resultado Final ---
    if (acertou) {
      JOptionPane.showMessageDialog(null, "Parabéns! Você acertou!\nPontuação: " + pontuacao + " pontos.");
    } else {
      JOptionPane.showMessageDialog(null, "Que pena, você não acertou. A resposta era: " + resposta);
    }
  }
}