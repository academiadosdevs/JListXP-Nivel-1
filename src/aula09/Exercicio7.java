package aula09;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-09-07
 */
public class Exercicio7 {
  public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog("Digite o nome de usuário desejado:");

    // Verifica se o nome NÃO é "admin".
    boolean nomeDisponivel = !nome.equals("admin");

    JOptionPane.showMessageDialog(null, "O nome de usuário está disponível? " + nomeDisponivel);
  }
}