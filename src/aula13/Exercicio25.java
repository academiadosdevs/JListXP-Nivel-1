package aula13;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-13-25 (Substituído - Versão Simplificada)
 */
public class Exercicio25 {
  public static void main(String[] args) {
    String palavra = JOptionPane.showInputDialog("Digite uma palavra em maiúsculas para codificar:").toUpperCase();
    String palavraCodificada = "";

    // O laço percorre cada letra da palavra original
    for (char letra : palavra.toCharArray()) {
      char novaLetra;

      // Trata os casos especiais do final do alfabeto
      if (letra == 'Y') {
        novaLetra = 'A';
      } else if (letra == 'Z') {
        novaLetra = 'B';
      } else {
        // Para as outras letras, apenas soma 2 ao seu código
        novaLetra = (char) (letra + 2);
      }
      
      palavraCodificada += novaLetra;
    }

    JOptionPane.showMessageDialog(null, "Palavra codificada: " + palavraCodificada);
  }
}