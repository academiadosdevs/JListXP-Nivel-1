package aula04;

/**
 * ID do exercício: XP1-04-04
 */
public class Exercicio4 {
  public static void main(String[] args) {
    /**
     * Nome da pizzaria (String)
     * 
     * Sabor da pizza (String)
     * 
     * Tamanho da pizza (char) — use 'P', 'M' ou 'G'
     * 
     * Valor da pizza (float)
     * 
     * Taxa de entrega (float)
     * 
     * Valor total (float, somando tudo)
     * 
     * A pizza tem borda recheada? (boolean)
     * 
     * Imprima todos os dados do pedido com System.out.println.
     */
    String sabor = "4 queijos";
    char tamanho = 'G';
    float valor = 89.99f;
    float taxaEntrega = 6;
    float valorTotal = valor + taxaEntrega;
    boolean bordaRecheada = true;

    System.out.println(sabor);
    System.out.println(tamanho);
    System.out.println(valor);
    System.out.println(taxaEntrega);
    System.out.println(valorTotal);
    System.out.println(bordaRecheada);
  }
}
