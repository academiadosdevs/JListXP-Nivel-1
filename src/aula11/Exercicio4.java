package aula11;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-11-04
 */
public class Exercicio4 {
  public static void main(String[] args) {
    String entrada = JOptionPane.showInputDialog("Digite um número de 1 a 5 para o treino:");
    int dia = Integer.parseInt(entrada);
    String treino;

    switch (dia) {
      case 1:
        treino = "Segunda → Dia de peito e tríceps. Aquecimento: 10 flexões.";
        break;
      case 2:
        treino = "Terça → Dia de costas e bíceps. Aquecimento: barra e remada.";
        break;
      case 3:
        treino = "Quarta → Dia de pernas. Agachamento é sagrado.";
        break;
      case 4:
        treino = "Quinta → Dia de ombros. Levantamento lateral garantido.";
        break;
      case 5:
        treino = "Sexta → Full Body! O treino raiz antes do fim de semana.";
        break;
      default:
        treino = "Treino inválido. Hoje é descanso?";
        break;
    }
    JOptionPane.showMessageDialog(null, treino);
  }
}