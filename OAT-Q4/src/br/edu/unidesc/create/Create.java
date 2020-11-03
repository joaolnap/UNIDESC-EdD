package br.edu.unidesc.create;

import java.util.Scanner;

public class Create {
   //Criando o metodo que ira preencher a matriz com a quantidade dos produtos
    public static void PrenchendoMatriz(int[][]m){
        Scanner entr = new Scanner(System.in);
        for( int i= 0; i< m.length;i++){
            for (int j= 0; j< m[0].length;j++){
                System.out.println("informe a quantidade do produto : "+i+" vedido no dia"+j);
                m[i][j]= entr.nextInt();
            }
        }
    }

    //Criando metodo que ira preencher o vetor com o valor dos produtos
    public static void ṔreenchenVetor(int[] m){
        Scanner entr = new Scanner(System.in);
        for (int j= 0; j< m.length;j++){
            System.out.println("informe o valor do "+j+" produto");
            m[j]= entr.nextInt();
        }
    }

    //Criando metodo que ira calcular o total de vendidos de cada produto
    public static int[] QuantidadeProduto(int[][]m){
        int soma = 0;
        int [] vetorQuantidade = new int[3];

        for( int i= 0; i< m.length;i++){
            for (int j= 0; j< m[0].length;j++){
                soma = soma + m[i][j];
            }
            vetorQuantidade[i]=soma;
            soma =0;
        }
        return vetorQuantidade;
    }


    //Criando metodo que ira calcular o valor total do produto
    public static int[] valorTotalProduto(int[] vQ,int[] vV) {
        int[] vetorValorTotal = new int[3];
        for (int i = 0; i < vV.length; i++) {
           vetorValorTotal[i]=vQ[i]*vV[i];
        }
        return vetorValorTotal;
    }

    //Criando metodo para imprimir outros metodos
    public static  void Imprimir(int[]m){
        for(int i=0;i<m.length;i++){
            System.out.println(m[i]);
        }
    }
    //Criando metodo para calcular o valor total de vendas da semana
    public static void valorSemana(int[] vQ,int[] vV) {
        int soma =0;
        int[] vetorValorTotal = new int[3];
        for (int i = 0; i < vV.length; i++) {
            vetorValorTotal[i]=vQ[i]*vV[i];
            soma = soma + vetorValorTotal[i];
        }
        System.out.println(soma);
    }
    //Criando metodo que ira determinar qual produto vendeu mais
    public static int[] ProdutoMaisVendido(int[][]m){
        int soma = 0;
        int [] vetorQuantidade = new int[3];
        int maior=0;
        int mais=0;

        for( int i= 0; i< m.length;i++){
            for (int j= 0; j< m[0].length;j++){
                soma = soma + m[i][j];
            }
            vetorQuantidade[i]=soma;
            if(vetorQuantidade[i]>maior){
                maior= vetorQuantidade[i];
                mais = i;
            }
            soma =0;

        }
        System.out.println("O produto que mais vendeu durante a semana foi o :");
        System.out.println(mais);
        return vetorQuantidade;
    }
}
