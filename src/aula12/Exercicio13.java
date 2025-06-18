package aula12;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-12-13 (Versão com dificuldade progressiva)
 */
public class Exercicio13 {
  public static void main(String[] args) {
    int numeroSorteado = 0;
    int tentativas = 0;

    // O laço 'while' continua enquanto o número sorteado não for múltiplo de 13.
    // A condição (numeroSorteado % 13 != 0 || numeroSorteado != 0) será 'true' até encontrarmos o número.
    // Começamos com 0 para garantir que o laço execute pelo menos uma vez.
    while (numeroSorteado % 13 != 0 || numeroSorteado == 0) {
      // Gera um número aleatório de 1 a 100
      numeroSorteado = 1 + (int) (Math.random() * 100);
      tentativas++; // Incrementa o contador de tentativas
      System.out.println("Tentativa " + tentativas + ": " + numeroSorteado);
    }

    String mensagem = String.format(
      "Finalmente!\n\n" +
      "O número %d, que é múltiplo de 13, foi encontrado.\n" +
      "Foram necessárias %d tentativas.",
      numeroSorteado,
      tentativas
    );

    JOptionPane.showMessageDialog(null, mensagem);
  }
}