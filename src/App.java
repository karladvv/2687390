import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        int number1, number2, resultado;
        System.out.println("Ingrese un numero");
        number1= lectura.nextInt();
        System.out.println("Ingrese el otro numero");
        number2= lectura.nextInt();

        resultado= number1+number2;
        System.out.println("la suma entre "+ number1+ "y "+ number2+ "es " +resultado );

        
        String name;
        lectura.nextLine();//limpieza de buffer
        System.out.println("Ingrese  un nombre ");
        name = lectura.nextLine();
        System.out.println("El nombre ingresado fue ");


        lectura.close();
    }
}

