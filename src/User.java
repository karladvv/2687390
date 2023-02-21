import java.util.Scanner;

public class User{
	public static void main(String[] args){
		Scanner lectura= new Scanner(System.in);
		int login=0;
		int pass=0;
			
				while((login!=1809)||(pass!=1234)){
					
					System.out.print("introduzca un ususario: ");
					login=lectura.nextInt();
					System.out.print("Introduzca su contraseña:");
					pass=lectura.nextInt();
					
				}
		lectura.close();
			
	}
}


