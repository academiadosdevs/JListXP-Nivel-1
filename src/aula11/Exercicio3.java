package aula11;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-11-03
 */
public class Exercicio3 {
  public static void main(String[] args) {
    String menu = "Escolha uma opção:\n" +
        "1. Hambúrguer (R$ 15,00)\n" +
        "2. Pizza (R$ 30,00)\n" +
        "3. Salada (R$ 12,00)\n" +
        "4. Pastel (R$ 10,00)";

    String entrada = JOptionPane.showInputDialog(menu);
    int opcao = Integer.parseInt(entrada);
    String resultado;

    switch (opcao) {
      case 1:
        resultado = "Hambúrguer - R$ 15,00";
        break;
      case 2:
        resultado = "Pizza - R$ 30,00";
        break;
      case 3:
        resultado = "Salada - R$ 12,00";
        break;
      case 4:
        resultado = "Pastel - R$ 10,00";
        break;
      default:
        resultado = "Opção inválida!";
        break;
    }
    JOptionPane.showMessageDialog(null, "Você escolheu: " + resultado);
  }
}