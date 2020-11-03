package br.edu.unidesc;

import br.edu.unidesc.create.Create;
import br.edu.unidesc.create.Imprimir;
import br.edu.unidesc.create.Par;

public class Main {

    public static void main(String[] args) {

        int []v1 = Create.initVetor();
        int []v2 = Par.evenVector(v1);
        int []v3 = Invert.inVector(v1);

        System.out.println("Valores pares são :");
        Imprimir.printVetor(v2);
        System.out.println("");
        System.out.println("O vetor invertido ficara desta maneiro :");
        Imprimir.printVetor(v3);
}
}
