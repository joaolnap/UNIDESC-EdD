package br.edu.unidesc;

public class Invert {
    public static int [] inVector(int []m){
      int n =0;
      int aux;
      int j = m.length -1;
      for(int i =0;i< m.length;i++){
          aux = m[i];
          m[i] = m[j];
          m[j]=aux;
          j--;
          if(i==(m.length/2)){
              break;
          }else if(i==(m.length/2)-1){
              break;
          }
      }
      return  m;
    }

}
