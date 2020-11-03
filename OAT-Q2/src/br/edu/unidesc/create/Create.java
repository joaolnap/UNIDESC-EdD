package br.edu.unidesc.create;

import java.util.Scanner;

public class Create {

    public static int[] initVetor() {
        Scanner entr = new Scanner(System.in);
        int n;
        do {
            System.out.println("Informe o tamanho do vetor sendo maior que zero");
            n = entr.nextInt();
        } while (n <= 0);

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe um valor inteiro :");
            vetor[i] = entr.nextInt();
        }

        return vetor;
    }
    public static void printVector(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static int[] appendVector(int []v1, int []v2){
        int []v3 = new int[v1.length + v2.length];
        int n=0;

        for(int i =0;i< v1.length;i++){
            v3[n++]=v1[i];
        }
        for(int i =0;i< v2.length;i++) {
            v3[n++] = v2[i];
        }
        return v3;
    }

    public static int[] perfectVector(int []v3){
        int soma = 0;
        int div;
        int n =0;
        int divisor = 0;
        int []v4 = new int [v3.length];
        for(int i =0;i< v3.length;i++){

            for (div =1;div < v3[i];div++){
            divisor = v3[i] % div;
                if(divisor ==0){
                    soma = soma +div;
                }
            }
            if(v3[i]==soma){
                v4[n]=v3[i];
                n++;
            }
            soma=0;
        }

       return v4;
    }



}