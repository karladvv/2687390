import java.util.Scanner;

public class Budget1 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        int spent,Budget,totals,op;
        op=1;
        while(op==1){
            System.out.println("Ingrese el gasto");
            spent=lectura.nextInt();
            System.out.println("Desea ingresar otro gasto 1.Si 2.No");
            op=lectura.nextInt();

        }

        lectura.close();
    }
}
