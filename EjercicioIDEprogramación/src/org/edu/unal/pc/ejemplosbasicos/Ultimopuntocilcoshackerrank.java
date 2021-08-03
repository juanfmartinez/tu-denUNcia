package org.edu.unal.pc.ejemplosbasicos;

import java.util.Scanner;

public class Ultimopuntocilcoshackerrank {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		Scanner lector = new Scanner(System.in);
		

		int R1, R2, F, PG, G = 0, Tf = 0, TPG = 0, contador = 0, g2 = 0,g3=0;

		R1 = lector.nextInt();
		R2 = lector.nextInt();
		F = lector.nextInt();
		PG = lector.nextInt();
		String P = "exit";
		
		if (P == "exit") {
			PG = lector.nextInt();
			
			while (R1 <= R2) {
				
				while (F != 0) {
					G = G + PG;
					
					F=F-1;
				}
				
			 if(PG<=R2 && F==0) {
				 
				 Tf=PG+g2;
				 
				 g2=PG;
			 }
			 
			 if (F==0) {
				 TPG=PG+g3;
				g3=PG;
			 }
			 R1++;
			}
			System.out.println(+G+ "" +Tf+ ""+TPG);
		}

	}
}
