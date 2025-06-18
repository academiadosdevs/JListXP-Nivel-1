package aula09;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-09-12
 */
public class Exercicio12 {
  public static void main(String[] args) {
    String entradaAnimes = JOptionPane.showInputDialog("Quantos animes você já assistiu?");
    int animes = Integer.parseInt(entradaAnimes);

    String entradaMangas = JOptionPane.showInputDialog("Quantos mangás você já leu?");
    int mangas = Integer.parseInt(entradaMangas);

    int total = animes + mangas;
    boolean verdadeiroOtaku = total >= 50;

    JOptionPane.showMessageDialog(null, "Você é um verdadeiro Otaku? " + verdadeiroOtaku);
  }
}