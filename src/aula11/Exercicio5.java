package aula11;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-11-05
 */
public class Exercicio5 {
  public static void main(String[] args) {
    String entrada = JOptionPane.showInputDialog("Digite um número de 1 a 5 para uma conquista:");
    int idConquista = Integer.parseInt(entrada);
    String conquista;

    switch (idConquista) {
      case 1:
        conquista = "Primeiro print na tela";
        break;
      case 2:
        conquista = "Primeira condição feita";
        break;
      case 3:
        conquista = "Switch desbloqueado";
        break;
      case 4:
        conquista = "Café, código e repetições";
        break;
      case 5:
        conquista = "Você chegou longe, dev!";
        break;
      default:
        conquista = "Conquista não encontrada!";
        break;
    }
    JOptionPane.showMessageDialog(null, "Conquista desbloqueada: " + conquista);
  }
}