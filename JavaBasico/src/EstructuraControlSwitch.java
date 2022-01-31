import java.util.Scanner;

/* Estructura de control Switch
 * switch(condicion a evaluar){
 * case "valor" :
 * 		//Codigo;
 * 		//break;
 * case "n" :
 * 		//codigo
 * 		//break
 * default:
 * 		//codigo;
 * }
 * 
 */

public class EstructuraControlSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el dia de la semana");
		String dia = sc.nextLine();
		switch(dia.toLowerCase().trim()) {
		case "lunes":
			System.out.println("El dia escrito es Lunes");
			break;
		case "martes":
			System.out.println("El dia escrito es Martes");
			break;
		case "miercoles":
			System.out.println("El dia escrito es Miercoles");
			break;
		case "jueves":
			System.out.println("El dia escrito es Jueves");
			break;
		case "viernes":
			System.out.println("El dia escrito es Viernes");
			break;
		case "sabado":
		case "domingo":
			System.out.println("El dia es del fin de semana");
			break;
		  default: 
			System.out.println("Dia no valido");
			break;
		}
		sc.close();
	}
}
