package br.edu.unidesc.create;

public class Par {
    public static int[] evenVector(int[] m){
        int i;
        int n =0;
        int []v2 = new int[m.length];

        for(i=0;i< m.length;i++){
            if(m[i]%2 ==0){
                v2[n] = m[i];
                n++;
            }
        }
        return v2;
    }


}
