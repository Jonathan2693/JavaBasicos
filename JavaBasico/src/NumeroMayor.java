import java.util.Scanner;

public class NumeroMayor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el primer numero");
		int numero1 = sc.nextInt();
		System.out.println("Ingresa el segundo numero");
		int numero2 = sc.nextInt();
		System.out.println("Ingresa el tercer numero");
		int numero3 = sc.nextInt();
		if ((numero1>=numero2)&&(numero1>=numero3)) {
			System.out.println("El numero 1 = " + numero1 + " es el mayor");
		}
		else if ((numero2>=numero1)&&(numero2>=numero3)) {
			System.out.println("El numero 2 = " + numero2 + " es el mayor");
		}
		else {
			System.out.println("El numero 3 = " + numero3 + " es el mayor");
		}

	}
	
}
