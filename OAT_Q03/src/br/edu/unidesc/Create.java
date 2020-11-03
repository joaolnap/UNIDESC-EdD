package br.edu.unidesc;

import java.util.Scanner;

public class Create {
    public static void preencherMatriz(int[][] m){
        Scanner entr = new Scanner(System.in);
        System.out.println("Prencheendo a matriz  ");
        for( int i= 0; i< m.length;i++){
            for (int j= 0; j< m[0].length;j++){
                System.out.println("Digite um valor inteiro : ");
                m[i][j]= entr.nextInt();
            }
        }

    }

    public static void CalcularMatriz(int[][] m){
        int soma=0;
        System.out.println("A soma da matriz transposta é: ");
        for( int i= 0; i< m.length;i++){
            for (int j= 0; j< m[0].length;j++){
                if(i==j) {
                    soma = soma + m[i][j];
                }
            }
        }
        System.out.println("Soma ="+soma);
    }

    public static void ImprimirMatriz(int[][] m){
        System.out.print("A matriz informada é: ");
        System.out.println("");
        for( int i= 0; i< m.length;i++){
            for (int j= 0; j< m[0].length;j++){
                System.out.print(m[i][j]);

            }
            System.out.println("");
        }

    }
    public static void TranspostaMatriz(int[][] m){
        System.out.print("Matriz transposta : ");
        System.out.println("");
        int[][] matriztransposta = new int[m[0].length][m.length];
        for( int i= 0; i< m.length;i++){
            for (int j= 0; j< m[0].length;j++){
                matriztransposta[j][i]=m[i][j];



            }

        }
        for (int i = 0; i <matriztransposta.length ; i++) {
            for (int j = 0; j <matriztransposta[0].length ; j++) {
                System.out.print(matriztransposta[i][j]);
            }
            System.out.println("");
        }
    }

}
