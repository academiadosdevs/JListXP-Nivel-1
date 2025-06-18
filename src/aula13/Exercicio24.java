package aula13;

import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Arrays;

/**
 * ID do exercício: XP1-13-24
 */
public class Exercicio24 {
  public static void main(String[] args) {
    String[] herois = new String[10];
    for (int i = 0; i < herois.length; i++) {
      herois[i] = JOptionPane.showInputDialog("Digite o nome do herói " + (i + 1) + ":");
    }

    // Embaralha o array
    Random random = new Random();
    for (int i = 0; i < herois.length; i++) {
      int indiceAleatorio = random.nextInt(herois.length);
      String temp = herois[i];
      herois[i] = herois[indiceAleatorio];
      herois[indiceAleatorio] = temp;
    }

    String timeDefesa = "Time de Defesa (Heróis):\n";
    for (int i = 0; i < 5; i++) {
      timeDefesa += "- " + herois[i] + "\n";
    }

    String timeAtaque = "Time de Ataque (Vilões):\n";
    for (int i = 5; i < 10; i++) {
      timeAtaque += "- " + herois[i] + "\n";
    }

    JOptionPane.showMessageDialog(null, timeDefesa + "\n" + timeAtaque);
  }
}