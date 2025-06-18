package aula11;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-11-06
 */
public class Exercicio6 {
  public static void main(String[] args) {
    String menu = "Menu Principal:\n" +
        "1. Iniciar jogo\n" +
        "2. Configurações\n" +
        "3. Sair do jogo";
    String entrada = JOptionPane.showInputDialog(menu);
    int opcao = Integer.parseInt(entrada);
    String acao;

    switch (opcao) {
      case 1:
        acao = "Iniciando o jogo...";
        break;
      case 2:
        acao = "Abrindo configurações...";
        break;
      case 3:
        acao = "Saindo do jogo. Até a próxima!";
        break;
      default:
        acao = "Opção inválida! Tente novamente.";
        break;
    }
    JOptionPane.showMessageDialog(null, acao);
  }
}