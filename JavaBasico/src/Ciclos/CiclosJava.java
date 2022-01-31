package Ciclos;

public class CiclosJava {
	public static void main(String[] args) {
		int control=0;
		while(control<10) {
			System.out.println("Control = " + control);
			control++;
		}
		control = 0;
		do {
			System.out.println("Control = " + control);
			control++;
		} while(control<10);
		control=0;
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				continue;	//Omite todo el codigo restante y salta a la siguiente iteracion del ciclos
				//break;// se usa para salirse del ciclo completamente
			}
			System.out.println("Control = " + i);
		}
	}
}
