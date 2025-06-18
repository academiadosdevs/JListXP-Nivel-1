package aula13;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 * ID do exercício: XP1-13-26
 */
public class Exercicio26 {
  public static void main(String[] args) {
    String[] naipes = { "Ouros", "Copas", "Espadas", "Paus" };
    String[] faces = { "Ás", "Rei", "Dama", "Valete", "10", "9" };
    Random random = new Random();

    // Sorteia um índice aleatório para cada array
    int indiceNaipe = random.nextInt(naipes.length);
    int indiceFace = random.nextInt(faces.length);

    // Combina os resultados
    String cartaSorteada = faces[indiceFace] + " de " + naipes[indiceNaipe];

    JOptionPane.showMessageDialog(null, "A carta sorteada foi: " + cartaSorteada);
  }
}