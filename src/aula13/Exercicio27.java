package aula13;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-13-27 (Substituído - Versão Criativa)
 */
public class Exercicio27 {
  public static void main(String[] args) {
    String[] inventario = new String[5];

    // Preenche o inventário
    for (int i = 0; i < inventario.length; i++) {
      inventario[i] = JOptionPane.showInputDialog("Você encontrou um item! Digite o nome do item " + (i + 1) + ":");
    }

    // Exibe o inventário
    String listaItens = "Seu inventário:\n\n";
    for (int i = 0; i < inventario.length; i++) {
      listaItens += (i + 1) + ". " + inventario[i] + "\n";
    }

    JOptionPane.showMessageDialog(null, listaItens);
  }
}