package aula10;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-10-08
 */
public class Exercicio8 {
  public static void main(String[] args) {
    String entrada = JOptionPane.showInputDialog("Escolha uma posição de 1 a 9 para chutar:");
    int chute = Integer.parseInt(entrada);
    int defesa = (int) (Math.random() * 9) + 1;

    String resultado;
    if (chute == defesa) {
      resultado = "Defendeu!";
    } else {
      resultado = "GOOOOL!";
    }

    JOptionPane.showMessageDialog(null, String.format(
        "Você chutou na posição %d.\n" +
        "O goleiro pulou na posição %d.\n\n" +
        "%s",
        chute, defesa, resultado));
  }
}