package aula09;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-09-14
 */
public class Exercicio14 {
  public static void main(String[] args) {
    String classe = JOptionPane.showInputDialog("Classe (Guerreiro, Mago, Druida ou Sacerdote):");
    String regiao = JOptionPane.showInputDialog("Região (Azeroth, Azkaban, Aurora ou Brightwood):");
    String arma = JOptionPane.showInputDialog("Arma (Machado cego, Picareta invertida, Adaga sem ponta ou Corrente sem elo):");
    String entradaNivel = JOptionPane.showInputDialog("Nível:");
    int nivel = Integer.parseInt(entradaNivel);

    boolean nivelMaximoAlcancado = nivel == 99;

    String mensagem = String.format(
      "Você agora é um %s da região de %s armado com um(a) %s.\nNível máximo alcançado: %b",
      classe,
      regiao,
      arma,
      nivelMaximoAlcancado
    );

    JOptionPane.showMessageDialog(null, mensagem);
  }
}