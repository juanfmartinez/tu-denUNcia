package org.edu.unal.pc.ejemplosbasicos;

import java.util.Scanner;

public class potencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		int Ni, Nf, N,H;

		Ni = lector.nextInt();

		Nf = lector.nextInt();

		
		
		
		
		if (Ni > Nf) {
			System.out.println("ERROR CON LA ENTRADA");
		}
		if (Ni <= Nf) {

			while (Ni<= Nf) {
				if ((0 <= Ni && Ni <= 30) && (0 <= Nf && Nf <= 30)) {
					System.out.println(+Ni + " = " + (int) Math.pow(2,Ni));
					Ni++;
				}
			}
		}
	}
}