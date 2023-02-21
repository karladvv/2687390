import java.util.Scanner;

public class Ciclos {
    
    public static void main() {
        Scanner lectura=new Scanner(System.in);
        int precio ,cantidad ,contador ,subtotal ,acomulador ;
        contador=0; acomulador=0;
        for(int x=1; x<=5;x++){
            System.out.println("Digite el precio");
            precio=lectura.nextInt();
            System.out.println("Digite cantidad");
            cantidad=lectura.nextInt();

            contador= contador+1;
            subtotal= precio*cantidad;
            acomulador= acomulador+subtotal;
            

        }
        lectura.close();
    }
}
