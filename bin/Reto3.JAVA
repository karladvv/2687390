import java.util.random.*;

public class Reto3 {
    public static void main(String[] args) {

 Random numAleatorio = new Random();

// Genera un boolean de forma aleatoria
boolean moneda = numAleatorio.nextBoolean();

if (moneda) {
    System.out.println("Cara");
} else {
    System.out.println("Cruz");
}
        
    }
}
