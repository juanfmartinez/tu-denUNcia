package org.edu.unal.pc.ejemplosbasicos;

import java.util.*;

public class TALLER3PUNTO1 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		Scanner lector = new Scanner(System.in);

		int edad = lector.nextInt();
		
		if (edad>=0) {
			if (0 <= edad & edad <= 5) {
				System.out.println("Usted es un Bebe");
			}
			if (5 < edad & edad <= 12) {
				System.out.println("Usted es un Nino");
			}
			if (13 <= edad & edad <= 21) {
				System.out.println("Usted es un Adolescente");
			}
			if (22 <= edad) {
				System.out.println("Usted es un Adulto");
			}
			
		}

		else {
			System.out.println("Su edad (" + edad + ") no es valida");
		}
		
		lector.close();

	}
}
