import java.util.Scanner;

public class Reto1 {public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
        double f, c;
        System.out.println("Ingrese la temperatura en grados Fahrenheit(°F)");
        f=lectura.nextDouble();
        c= (f-32)/1.8 ;
        System.out.println("La temperatura en grados Centigrados(°C) es "+c+"(°C)");

        lectura.close();
}
    
}
