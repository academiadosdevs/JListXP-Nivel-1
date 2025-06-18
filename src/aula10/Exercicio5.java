package aula10;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-10-05
 */
public class Exercicio5 {
  public static void main(String[] args) {
    String entrada = JOptionPane.showInputDialog("Digite um número de 1 a 5 para uma recompensa:");
    int recompensa = Integer.parseInt(entrada);
    String mensagem;

    if (recompensa == 1) {
      mensagem = "Você desbloqueou a conquista: 'Primeiro código compilado!'";
    } else if (recompensa == 2) {
      mensagem = "Conquista: 'Aprendiz do Debug'";
    } else if (recompensa == 3) {
      mensagem = "XP +10: Você sobreviveu ao erro de sintaxe.";
    } else if (recompensa == 4) {
      mensagem = "Você aprendeu a usar if. Agora já pode julgar as decisões da vida.";
    } else if (recompensa == 5) {
      mensagem = "Conquista épica: você terminou esta lista.";
    } else {
      mensagem = "Recompensa não encontrada.";
    }
    JOptionPane.showMessageDialog(null, mensagem);
  }
}