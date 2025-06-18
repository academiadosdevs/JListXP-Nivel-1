package aula12;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-12-23
 */
public class Exercicio23 {
  public static void main(String[] args) {
    int maiorPeixe = 0; // Guarda o tamanho do maior peixe até agora
    String relatorioPesca = "Peixes pescados (cm):\n";

    for (int i = 1; i <= 8; i++) {
      // Gera um tamanho aleatório de 10 a 80cm
      int peixeAtual = 10 + (int) (Math.random() * 71);
      relatorioPesca += peixeAtual + "cm ";

      // Se o peixe atual for maior que o 'maiorPeixe' já registrado, ele se torna o novo maior
      if (peixeAtual > maiorPeixe) {
        maiorPeixe = peixeAtual;
      }
    }

    String resultado = relatorioPesca + "\n\nParabéns! O seu maior troféu foi um peixe de " + maiorPeixe + "cm!";
    JOptionPane.showMessageDialog(null, resultado);
  }
}