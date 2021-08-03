package org.edu.unal.pc.ejemplosbasicos;

import java.util.Scanner;

//Grupo Conformado por Juan Francisco Martinez Rojas, Camilo Ospina Hoyos, Alejadnro Herrera//
public class TALLER3EJERCICIO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		Double OP1 = lector.nextDouble();
		Double OP2 = lector.nextDouble();
		char OP = lector.next().charAt(0);

		if (OP1 > 0 & OP1 > OP2) {
			if ((char) OP == '+') {
				double R = OP1 + OP2;
				if (R > 100 & R<1000) {
					System.out.println("Total: " + R + "." + " Existencias superan el centenar de unidades");
				}
				if (R >= 1000) {
					System.out.println("Total: " + R + "." + " Existencias superan el millar de unidades");
				}
				if (R < 100) {
					System.out.println("Total: " + R + "." + " Stock insuficiente");
				}
			}
			if ((char) OP == '*') {
				double R = OP1 * OP2;
				if (R > 100 & R<1000) {
					System.out.println("Total: " + R + "." + " Existencias superan el centenar de unidades");
				}
				if (R >= 1000) {
					System.out.println("Total: " + R + "." + " Existencias superan el millar de unidades");
				}
				if (R < 100) {
					System.out.println("Total: " + R + "." + " Stock insuficiente");
				}
			}
			if ((char) OP == '-') {
				double R = OP1 - OP2;
				if (R > 100 & R<1000) {
					System.out.println("Total: " + R + "." + " Existencias superan el centenar de unidades");
				}
				if (R >= 1000) {
					System.out.println("Total: " + R + "." + " Existencias superan el millar de unidades");
				}
				if (R < 100) {
					System.out.println("Total: " + R + "." + " Stock insuficiente");
				}
			}
			if ((char) OP == '/') {
				if (OP2 != 0) {
					double R = OP1 / OP2;
					if (R > 100 & R<1000) {
						System.out.println("Total: " + R + "." + " Existencias superan el centenar de unidades");
					}
					if (R >= 1000) {
						System.out.println("Total: " + R + "." + " Existencias superan el millar de unidades");
					}
					if (R < 100) {
						System.out.println("Total: " + R + "." + " Stock insuficiente");
					}
				} else {
					System.out.println("La division por cero no es posible");
				}
			}
		}
		if (OP1 < OP2) {
			System.out.println((int)+OP1+ " debe ser mayor que " +(int)+OP2);
		}
		if (OP1 < OP2 & OP1 < 0) {
			System.out.println("El primer operando debe ser el mayor y positivo");
		}
		lector.close();
	}

}
