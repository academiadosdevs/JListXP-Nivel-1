package aula07;

import javax.swing.JOptionPane;

/**
 * ID do exercicio: XP1-07-07
 */
public class Exercicio7 {
    public static void main(String[] args) {
        // Pede a quantidade de músicas para cada gênero
        String kpopStr = JOptionPane.showInputDialog("Quantas músicas de K-pop você ouviu?");
        String rockStr = JOptionPane.showInputDialog("Quantas músicas de Rock você ouviu?");
        String mpbStr = JOptionPane.showInputDialog("Quantas músicas de MPB você ouviu?");

        // Converte as respostas (String) para inteiros (int)
        int kpop = Integer.parseInt(kpopStr);
        int rock = Integer.parseInt(rockStr);
        int mpb = Integer.parseInt(mpbStr);

        // Soma o total de músicas
        int totalMusicas = kpop + rock + mpb;

        // Monta a mensagem final
        String mensagem = "Você ouviu um total de " + totalMusicas + " músicas!";

        // Exibe o resultado em uma janela de diálogo
        JOptionPane.showMessageDialog(null, mensagem);
    }
}