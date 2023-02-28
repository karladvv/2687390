import java.util.Scanner;

public class Caraosello {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int number;
        number = (int) (Math.random() * 2 + 1);
        int number1;
        System.out.println("Ingrese un numero del 1 al 2. 1:Cara y 2:Cruz");
        number1 = lectura.nextInt();

        if (number == 1 && number == number1) {
            System.out.println("Ah Ganado con Cara");
        } else if (number == 2 && number == number1) {
            System.out.println("Ah Ganado con Cruz");
        } else if (number == 1) {
            System.out.println("Ah Perdido con Cara");
        } else if (number == 2) {
            System.out.println("Ah Perdido con Cruz");
        }

        lectura.close();
    }

}
