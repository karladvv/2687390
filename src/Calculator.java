import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double num1,num2,rest,rest1;
        int op;

        System.out.println("Ingrese un primer numero");
        num1=lectura.nextDouble();
        System.out.println("Ingrese un segundo numero");
        num2=lectura.nextDouble();
        System.out.println("1.suma 2.resta 3.multiplicacion 4.division 5.potencia 6.raiz cuadrada");
        op=lectura.nextInt();

        switch (op) {
            case 1:
            rest=num1+num2;
            System.out.println("La suma entre el "+num1+" y "+num2+" es "+rest);
            break;
            case 2:
            rest=num1-num2;
            System.out.println("La resta entre el "+num1+" y "+num2+" es "+rest);
            break;
            case 3:
            rest=num1*num2;
            System.out.println("La multiplicacion entre el "+num1+" y "+num2+" es "+rest);
            break;
            case 4:
            rest=num1/num2;
            System.out.println("La division entre el "+num1+" y "+num2+" es "+rest);
            break;
            case 5:
            rest=Math.pow(num1, num2);
            System.out.println(num1+" elevado a "+num2+" es "+rest);
            break;
            case 6:
            rest=Math.sqrt(num1);
            rest1=Math.sqrt(num2);
            System.out.println("La raiz cuadrada de "+num1+" es "+rest+"y la raiz cuadradade "+num2+" es "+rest1);
            break;
        }
        lectura.close();
        }

    }
