package aula13;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-13-11
 */
public class Exercicio11 {
  public static void main(String[] args) {
    String[] cidades = new String[5];
    for (int i = 0; i < cidades.length; i++) {
      cidades[i] = JOptionPane.showInputDialog("Digite o nome da cidade " + (i + 1) + ":");
    }

    String letra = JOptionPane.showInputDialog("Digite uma letra:");
    String resultado = "Cidades que começam com '" + letra + "':\n";

    for (int i = 0; i < cidades.length; i++) {
      // Usamos startsWith para verificar se a string começa com a letra
      if (cidades[i].toLowerCase().startsWith(letra.toLowerCase())) {
        resultado += cidades[i] + "\n";
      }
    }
    JOptionPane.showMessageDialog(null, resultado);
  }
}