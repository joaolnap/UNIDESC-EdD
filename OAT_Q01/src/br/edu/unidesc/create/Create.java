package br.edu.unidesc.create;

import java.util.Scanner;


public class Create {

    public static int[] initVetor(){
        Scanner entr = new Scanner(System.in);
        int n;
        do{
            System.out.println("Informe o tamanho do vetor sendo maior que zero");
            n = entr.nextInt();
        }while(n <= 0);

        int []vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("informe um valor inteiro");
            vetor[i] = entr.nextInt();
        }
        System.out.println("Os valores informados foram :");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        return vetor;
    }

}
