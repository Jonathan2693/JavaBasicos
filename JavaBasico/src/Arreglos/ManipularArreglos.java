package Arreglos;
/*Crea una clase llamara ManipularArreglo
crea un array con los siguientes números enteros:

1, 6, 45, 53, 80, 102, 145, 326, 450, 892
Crea un programa que use un ciclo que tome los números de arreglo y devuelva la suma total, la suma de los números pares y la suma de los números impares.
*/

public class ManipularArreglos {
	public static void main(String[] args) {
		int[] numeros = new int[] {1, 6, 45, 53, 80, 102, 145, 326, 450, 892};
		int suma=0,sumaPar=0,sumaImpar=0;
		for(int i=0;i<numeros.length;i++) {
			suma+=numeros[i];
			if(numeros[i]%2==0) {
				sumaPar+=numeros[i];
			}
			else {
				sumaImpar+=numeros[i];
			}
		}
		System.out.println("La suma es = "+ suma);
		System.out.println("La suma par es = "+ sumaPar);
		System.out.println("La suma impar es = "+ sumaImpar);
	}
}
