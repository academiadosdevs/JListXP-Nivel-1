package aula09;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-09-10
 */
public class Exercicio10 {
  public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog("Qual seu nome?");

    String entradaIdade = JOptionPane.showInputDialog("Qual sua idade?");
    int idade = Integer.parseInt(entradaIdade);

    boolean condicao = nome.equals("Ash") || idade < 12;

    JOptionPane.showMessageDialog(null, "O nome é 'Ash' ou a idade é menor que 12? " + condicao);
  }
}