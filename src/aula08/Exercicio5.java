package aula08;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-08-05 (Sugestão Equilibrada)
 */
public class Exercicio5 {
  public static void main(String[] args) {
    // Gerando status para FORÇA (soma de 3 dados de 6 lados)
    int dado1 = (int) (Math.random() * 6) + 1;
    int dado2 = (int) (Math.random() * 6) + 1;
    int dado3 = (int) (Math.random() * 6) + 1;
    int forca = dado1 + dado2 + dado3;

    // Gerando status para PODER MÁGICO (soma de 3 dados de 6 lados)
    dado1 = (int) (Math.random() * 6) + 1;
    dado2 = (int) (Math.random() * 6) + 1;
    dado3 = (int) (Math.random() * 6) + 1;
    int poderMagico = dado1 + dado2 + dado3;

    // Monta a mensagem final com os status gerados
    String mensagem = String.format(
      "Força: %d\n" +
      "Poder Mágico: %d",
      forca,
      poderMagico
    );

    // Exibe os status do personagem
    JOptionPane.showMessageDialog(null, mensagem);
  }
}