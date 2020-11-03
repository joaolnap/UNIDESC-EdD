package br.edu.unidesc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Informe a quntidade de linhas e logo em seguida a quantidade de colunas: ");
        Scanner entr = new Scanner(System.in);
        int n = entr.nextInt();
        int m = entr.nextInt();
        int [][] matriz = new int[n][m];
        Create.preencherMatriz(matriz);
        System.out.println("");
        Create.ImprimirMatriz(matriz);
        System.out.println("");
        Create.TranspostaMatriz(matriz);
        System.out.println("");
        Create.CalcularMatriz(matriz);
    }
}
