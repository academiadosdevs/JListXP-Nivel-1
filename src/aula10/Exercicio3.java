package aula10;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-10-03
 */
public class Exercicio3 {
  public static void main(String[] args) {
    String entrada = JOptionPane.showInputDialog("Digite um número de 1 a 4 para o treino:");
    int treino = Integer.parseInt(entrada);
    String descricao;

    if (treino == 1) {
      descricao = "1 - Full Body → Treino completo, força total!";
    } else if (treino == 2) {
      descricao = "2 - Pull → Hora de puxar costas e bíceps.";
    } else if (treino == 3) {
      descricao = "3 - Push → Peito, ombro e tríceps na missão.";
    } else if (treino == 4) {
      descricao = "4 - Legs → Chame no agachamento!";
    } else {
      descricao = "Opção inválida!";
    }
    JOptionPane.showMessageDialog(null, descricao);
  }
}