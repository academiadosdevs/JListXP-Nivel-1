package aula10;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-10-12
 */
public class Exercicio12 {
  public static void main(String[] args) {
    int totalCalorias = 0;

    // Prato
    String entradaPrato = JOptionPane.showInputDialog("Escolha o prato:\n1. Vegetariano (180 kcal)\n2. Peixe (230 kcal)\n3. Frango (250 kcal)\n4. Carne (350 kcal)");
    int prato = Integer.parseInt(entradaPrato);
    if (prato == 1) totalCalorias += 180;
    else if (prato == 2) totalCalorias += 230;
    else if (prato == 3) totalCalorias += 250;
    else if (prato == 4) totalCalorias += 350;

    // Sobremesa
    String entradaSobremesa = JOptionPane.showInputDialog("Escolha a sobremesa:\n1. Abacaxi (75 kcal)\n2. Sorvete (110 kcal)\n3. Mousse (170 kcal)");
    int sobremesa = Integer.parseInt(entradaSobremesa);
    if (sobremesa == 1) totalCalorias += 75;
    else if (sobremesa == 2) totalCalorias += 110;
    else if (sobremesa == 3) totalCalorias += 170;

    // Bebida
    String entradaBebida = JOptionPane.showInputDialog("Escolha a bebida:\n1. Água (0 kcal)\n2. Suco (70 kcal)\n3. Refrigerante (100 kcal)");
    int bebida = Integer.parseInt(entradaBebida);
    if (bebida == 1) totalCalorias += 0;
    else if (bebida == 2) totalCalorias += 70;
    else if (bebida == 3) totalCalorias += 100;
    
    JOptionPane.showMessageDialog(null, "Total de calorias da refeição: " + totalCalorias + " kcal");
  }
}