import java.security.PublicKey;
import java.util.Scanner;

public class ScanneryBuffer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();		//Se usa para limpiar el buffer una vez que se pidio un entero
		System.out.println("Introduce un numero");
		int numero = sc.nextInt();
		sc.close();
		System.out.println("Tu nombre es " + nombre + ", y tu numero es " + numero);
		System.out.println();
	}

}
