package aula10;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-10-04
 */
public class Exercicio4 {
  public static void main(String[] args) {
    String entrada = JOptionPane.showInputDialog("Digite um número de 1 a 5 para uma dica:");
    int dica = Integer.parseInt(entrada);
    String mensagem;

    if (dica == 1) {
      mensagem = "1 - Copiar código ajuda, mas entender transforma.";
    } else if (dica == 2) {
      mensagem = "2 - Leia os erros com calma. Eles são professores.";
    } else if (dica == 3) {
      mensagem = "3 - Voltar ao básico é sinal de inteligência, não de fracasso.";
    } else if (dica == 4) {
      mensagem = "4 - System.out.println é seu melhor amigo.";
    } else if (dica == 5) {
      mensagem = "5 - Ninguém nasce pronto. Continue praticando.";
    } else {
      mensagem = "Dica não encontrada.";
    }
    JOptionPane.showMessageDialog(null, mensagem);
  }
}