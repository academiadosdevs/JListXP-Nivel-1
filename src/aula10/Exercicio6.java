package aula10;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-10-06
 */
public class Exercicio6 {
  public static void main(String[] args) {
    String entradaNumero = JOptionPane.showInputDialog("Escolha um número:");
    int numeroJogador = Integer.parseInt(entradaNumero);

    String escolhaJogador = JOptionPane.showInputDialog("Digite par ou impar:");

    int numeroComputador = (int) (Math.random() * 6); // 0 a 5
    int soma = numeroJogador + numeroComputador;
    boolean somaEhPar = soma % 2 == 0;

    String resultado;

    if ((somaEhPar && escolhaJogador.equalsIgnoreCase("par")) || (!somaEhPar && escolhaJogador.equalsIgnoreCase("impar"))) {
      resultado = "Você ganhou.";
    } else {
      resultado = "Você perdeu.";
    }

    String paridadeSoma = somaEhPar ? "par" : "impar";

    JOptionPane.showMessageDialog(null, String.format(
        "O computador sorteou: %d\n" +
        "%d + %d = %d\n" +
        "%d é %s\n" +
        "%s",
        numeroComputador, numeroJogador, numeroComputador, soma, soma, paridadeSoma, resultado));
  }
}