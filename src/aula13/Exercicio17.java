package aula13;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-13-17
 */
public class Exercicio17 {
  public static void main(String[] args) {
    String[] alunos = new String[10];

    for (int i = 0; i < alunos.length; i++) {
      alunos[i] = JOptionPane.showInputDialog("Digite o nome do aluno " + (i + 1) + ":");
    }

    System.out.println("Alunos em ordem invertida:");
    for (int i = alunos.length - 1; i >= 0; i--) {
      System.out.println(alunos[i]);
    }
  }
}