package estructurasdatos;

import java.util.Scanner;

public class MisArrays {
    public static void main(String[] args){
        int [] vector1;
        vector1=new int[10];
        int [] vector={30,50,25,85,12,6,32,41,23,63};
        vector1[6]=32;
        for(int i : vector){
            System.out.println(i);
        }
        Scanner lectura=new Scanner(System.in);
        for(int p=0;p<vector.length;p++){
            System.out.println("Digite el dato de la posicion "+p);
            vector1[p]=lectura.nextInt();
        }
        for(int i :vector1){
            System.out.println(i);
        }
        lectura.close();
    }
}

