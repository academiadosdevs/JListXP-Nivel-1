package aula13;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-13-18
 */
public class Exercicio18 {
  public static void main(String[] args) {
    String[] filmes = { "O Senhor dos Anéis", "Matrix", "Interestelar",
        "A Origem", "Clube da Luta", "O Poderoso Chefão" };
    int opcao;

    do {
      String menu = "Escolha um filme ou saia:\n";
      for (int i = 0; i < filmes.length; i++) {
        menu += (i + 1) + ". " + filmes[i] + "\n";
      }
      menu += (filmes.length + 1) + ". Sair";

      String entrada = JOptionPane.showInputDialog(menu);
      opcao = Integer.parseInt(entrada);

      if (opcao > 0 && opcao <= filmes.length) {
        JOptionPane.showMessageDialog(null, "Você selecionou: " + filmes[opcao - 1]);
      } else if (opcao != filmes.length + 1) {
        JOptionPane.showMessageDialog(null, "Opção inválida!");
      }

    } while (opcao != filmes.length + 1);

    JOptionPane.showMessageDialog(null, "Até a próxima!");
  }
}