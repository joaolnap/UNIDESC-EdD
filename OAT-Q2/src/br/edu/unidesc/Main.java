package br.edu.unidesc;

import br.edu.unidesc.create.Create;

public class Main {

    public static void main(String[] args) {
	int []v1 = Create.initVetor();
	int []v2 = Create.initVetor();
	int []v3 = Create.appendVector(v1,v2);
	int []v4 = Create.perfectVector(v3);

	    System.out.println("Os numeros informados no 1º vetor sao :");
	Create.printVector(v1);
        System.out.println("");
        System.out.println("Os numeros informados no 2º vetor sao :");
    Create.printVector(v2);
        System.out.println("");
        System.out.println("Os numeros dos dois vetores concatenados são:");
    Create.printVector(v3);
        System.out.println("");
        System.out.println("Os numeros perfeitos sao :");
    Create.printVector(v4);



    }

}
