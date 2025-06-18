package aula13;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-13-21
 */
public class Exercicio21 {
  public static void main(String[] args) {
    float[] notas = new float[5];
    float soma = 0;

    for (int i = 0; i < notas.length; i++) {
      String entrada = JOptionPane.showInputDialog("Digite a nota " + (i + 1) + ":");
      notas[i] = Float.parseFloat(entrada);
      soma += notas[i];
    }

    float media = soma / notas.length;
    String resultado = "Média final: " + media + "\n";

    if (media >= 7) {
      resultado += "Aluno APROVADO!";
    } else {
      resultado += "Aluno REPROVADO.";
    }
    JOptionPane.showMessageDialog(null, resultado);
  }
}