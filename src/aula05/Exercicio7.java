package aula05;

/**
 * ID do exercício: XP1-05-07
 */
public class Exercicio7 {
  public static void main(String[] args) {
    String nome = "Letícia";
    int horasPorDia = 2;
    String motivo = "poder trabalhar de casa de chinelo e sem uniforme";
    boolean acreditaQueVaiConseguir = true;

    String frase = String.format("Eu sou a %s, estudo Java %d horas por dia para %s. Vou conseguir? %b", nome,
        horasPorDia, motivo, acreditaQueVaiConseguir);
    System.out.println(frase);
  }
}
