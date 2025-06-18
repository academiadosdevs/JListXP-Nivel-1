package aula09;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-09-13
 */
public class Exercicio13 {
  public static void main(String[] args) {
    String usuario = JOptionPane.showInputDialog("Usuário:");
    String senha = JOptionPane.showInputDialog("Senha:");

    boolean loginValido = usuario.equals("academia-dos-devs") && senha.equals("40028922");

    JOptionPane.showMessageDialog(null, "Login válido? " + loginValido);
  }
}