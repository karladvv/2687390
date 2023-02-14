import java.util.Scanner;

public class Number {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        int number1, number2, resultado;
        System.out.println("Ingresa un numero");
        number1= lectura.nextInt();
        System.out.println("Igresa otro numero");
        number2= lectura.nextInt();
        resultado= number1+number2;
        if (number1>number2){
            System.out.println("suma si es mayor"+number1+"y"+number2+"es"+resultado);
        }
        else{
            resultado= number1-number2;
            System.out.println("resta si es menor"+number1+"y"+number2+"es"+resultado);
        }


        lectura.close();
    }
    
}
