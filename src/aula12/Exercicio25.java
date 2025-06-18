package aula12;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 * ID do exercício: XP1-12-25
 */
public class Exercicio25 {
  public static void main(String[] args) {
    String entrada = JOptionPane.showInputDialog("Qual o tamanho da senha que você deseja?");
    int tamanho = Integer.parseInt(entrada);

    Random random = new Random();
    // StringBuilder é mais eficiente para montar strings dentro de laços
    StringBuilder senha = new StringBuilder();

    for (int i = 0; i < tamanho; i++) {
      // 1. Sorteia o TIPO de caractere (0=número, 1=letra minúscula, 2=letra maiúscula)
      int tipoCaractere = random.nextInt(3);
      
      char caractereSorteado;

      switch (tipoCaractere) {
        case 0: // Gerar um NÚMERO
          // Códigos ASCII de '0' (48) a '9' (57)
          caractereSorteado = (char) (random.nextInt(10) + 48);
          break;
        case 1: // Gerar uma LETRA MINÚSCULA
          // Códigos ASCII de 'a' (97) a 'z' (122)
          caractereSorteado = (char) (random.nextInt(26) + 97);
          break;
        case 2: // Gerar uma LETRA MAIÚSCULA
          // Códigos ASCII de 'A' (65) a 'Z' (90)
          caractereSorteado = (char) (random.nextInt(26) + 65);
          break;
        default:
          // Caso padrão, para segurança, gera um caractere qualquer
          caractereSorteado = '?';
          break;
      }
      senha.append(caractereSorteado);
    }
    
    JOptionPane.showMessageDialog(null, "Senha gerada: " + senha.toString());
  }
}