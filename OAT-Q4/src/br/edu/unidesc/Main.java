package br.edu.unidesc;

import br.edu.unidesc.create.Create;

public class Main {

    public static void main(String[] args) {
        int [][]matriz = new int[3][7];
        int []valorProduto = new int[3];
        Create.PrenchendoMatriz(matriz);
        Create.ṔreenchenVetor(valorProduto);
        int []vetorQuantidade = Create.QuantidadeProduto(matriz);
        System.out.println("A quantidade total de cada produto informado e respectivamente :");
        Create.Imprimir(vetorQuantidade);
        int []valorTotalProduto =Create.valorTotalProduto(vetorQuantidade,valorProduto);
        System.out.println("E o valor total de cada produto informado e respectivamente :");
        Create.Imprimir(valorTotalProduto);
        System.out.println("E o valor total de vendas da semana foi:");
        Create.valorSemana(vetorQuantidade,valorProduto);
        Create.ProdutoMaisVendido(matriz);



    }
}
