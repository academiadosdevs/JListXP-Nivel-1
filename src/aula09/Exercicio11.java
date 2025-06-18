package aula09;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-09-11
 */
public class Exercicio11 {
  public static void main(String[] args) {
    int respostaEstudou = JOptionPane.showConfirmDialog(null, "Você estudou hoje?", "Pergunta 1", JOptionPane.YES_NO_OPTION);
    int respostaPraticou = JOptionPane.showConfirmDialog(null, "Você praticou exercícios de Java hoje?", "Pergunta 2", JOptionPane.YES_NO_OPTION);

    boolean estudou = (respostaEstudou == JOptionPane.YES_OPTION);
    boolean praticou = (respostaPraticou == JOptionPane.YES_OPTION);

    boolean progressoGarantido = estudou && praticou;

    JOptionPane.showMessageDialog(null, "Seu progresso está garantido? " + progressoGarantido);
  }
}