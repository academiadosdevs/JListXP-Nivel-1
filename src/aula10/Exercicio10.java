package aula10;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-10-10
 */
public class Exercicio10 {
  public static void main(String[] args) {
    int num1 = (int) (Math.random() * 100); // 0 a 99
    int num2 = (int) (Math.random() * 100); // 0 a 99
    int somaCorreta = num1 + num2;

    String entrada = JOptionPane.showInputDialog(String.format("Qual é a soma de %d + %d?", num1, num2));
    int somaUsuario = Integer.parseInt(entrada);

    String resultado;
    if (somaUsuario == somaCorreta) {
      resultado = "Você acertou!";
    } else {
      resultado = "Você errou! A resposta correta era " + somaCorreta;
    }

    JOptionPane.showMessageDialog(null, resultado);
  }
}