import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args){
        int given1,given2,total;
        Scanner lectura = new Scanner(System.in);

        given1=(int)Math.random()*6+1;
        given2=(int)Math.random()*6+1;
        total=given1+given2;
    
        if (given1==1 && given2==1){
            System.out.println("El resultado del pirmer dado fue "+given1+" y el resultado de el segundo dado "+given2+" por lo tanto el resultado fue un par de unos y es Ganador");
        }
        if (total==3){
            System.out.println("El resultado del pirmer dado fue "+given1+" y el resultado de el segundo dado "+given2+"y su resultado es "+total+" por lo tanto es Ganador");
        }
        if (total==11){
            System.out.println("El resultado del pirmer dado fue "+given1+" y el resultado de el segundo dado "+given2+"y su resultado es "+total+" por lo tanto es Ganador");
        }
        if (total==7){
            System.out.println("El resultado del pirmer dado fue "+given1+" y el resultado de el segundo dado "+given2+"y su resultado es "+total+" por lo tanto es Ganador");
        }
        if (total==12 || total==2){
            System.out.println("El resultado del pirmer dado fue "+given1+" y el resultado de el segundo dado "+given2+"y su resultado es "+total+" por lo tanto es Ganador");
        }
        else {
            System.out.println("No cumplio con ningunade las condiciones y ha Perdido");
        }
    
        lectura.close();
    }
        
    }
   
