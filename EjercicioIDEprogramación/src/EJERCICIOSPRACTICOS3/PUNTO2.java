package EJERCICIOSPRACTICOS3;

import java.util.Scanner;

public class PUNTO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduzca un n�mero");

		int num = scan.nextInt();

		while (num != 0) {
			if (num > 0) {
				System.out.println("Positivo");
			} else {
				System.out.println("Negativo");
			}
			System.out.println("Introduzca otro n�mero");
			num=scan.nextInt();
			
		}
		System.out.println("Programa finalizado");
		scan.close();
	}
	

}
