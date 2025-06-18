package aula12;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-12-22
 */
public class Exercicio22 {
  public static void main(String[] args) {
    int distanciaTotal = 0;
    String diarioDeBordo = "Diário de Bordo da 'Estrela Cadente':\n\n";

    for (int dia = 1; dia <= 7; dia++) {
      // Gera um número aleatório entre 10 e 50
      int distanciaDoDia = 10 + (int) (Math.random() * 41);
      distanciaTotal += distanciaDoDia;
      diarioDeBordo += "Dia " + dia + ": avançou " + distanciaDoDia + " anos-luz.\n";
    }

    diarioDeBordo += "\nDistância total percorrida: " + distanciaTotal + " anos-luz.";
    JOptionPane.showMessageDialog(null, diarioDeBordo);
  }
}